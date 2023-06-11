package io.vallfg.lfg_server

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.routing.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.types.Player
import io.vallfg.types.WsData
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.time.Duration

fun Application.lfgWebsocket(
    lfgServer: LfgServer,
    config: WebSockets.WebSocketOptions.() -> Unit = {
        pingPeriod = Duration.ofSeconds(15)
        timeout = Duration.ofSeconds(15)
        maxFrameSize = Long.MAX_VALUE
        masking = false
    },
    onConnect: suspend (conn: DefaultWebSocketServerSession, sess: LfgSession) -> Unit = { _, _ ->},
    onDisconnect: suspend (conn: DefaultWebSocketServerSession, sess: LfgSession) -> Unit = {_, _ ->},
    onReceived: suspend (conn: DefaultWebSocketServerSession, sess: LfgSession, msg: WsData) -> Unit,
) {

    install(WebSockets) { config() }

    suspend fun DefaultWebSocketServerSession.handleWs(sess: LfgSession) {
        try {
            for (frame in incoming) {
                when (frame) {
                    is Frame.Text -> {
                        try {
                            onReceived(
                                /*conn*/this,
                                /*sess*/sess,
                                /*wsData*/Json.decodeFromString<WsData>(frame.readText())
                            )
                        } catch (e: SerializationException) {
                            e.printStackTrace()
                        } catch (e: IllegalArgumentException) {
                            e.printStackTrace()
                        }
                    }

                    is Frame.Binary -> {
                        val text = frame.readBytes().decodeToString()
                        onReceived(
                            /*conn*/this,
                            /*sessID*/sess,
                            /*wsData*/Json.decodeFromString<WsData>(text)
                        )
                    }

                    is Frame.Ping -> {
                        send(Frame.Pong(byteArrayOf()))
                    }

                    is Frame.Pong -> Unit
                    is Frame.Close -> {
                        return
                    }
                }
            }
        } catch (e: Exception) {
            return
        }
    }

    routing {
        webSocket("/join/{id}") {
            val args = call.parameters

            val postId: String = args["id"] ?: return@webSocket
            val sess = call.principal<LfgSession>() ?: return@webSocket
            val playerData: Player = sessionIdToPlayerData[sess.id] ?: return@webSocket

            val user  = User(
                conn = this,
                player = playerData
            )

            sess.joinedPostId = lfgServer.joinPost(
                user = user,
                clientId = sess.id,
                postId = postId
            )

            onConnect(this, sess)
            handleWs(sess)

            lfgServer.leavePost(user, sess.id, postId)

            sess.joinedPostId = ""

            onDisconnect(this, sess)
        }


        webSocket("/create/{needed}/{minrank}/{gamemode}") {
            val args = call.parameters

            val needed: Int = args["needed"]?.toIntOrNull() ?: return@webSocket
            val minRank: String = args["minrank"] ?: return@webSocket
            val gameMode: String = args["gamemode"] ?: return@webSocket

            val sess = call.principal<LfgSession>() ?: return@webSocket

            val playerData: Player = sessionIdToPlayerData[sess.id] ?: return@webSocket

            val user =  User(this, playerData)

            sess.joinedPostId = lfgServer.createPost(
                user = user,
                clientId = sess.id,
                config = {
                    setGameMode(gameMode)
                    setNeeded(needed)
                    setMinRank(minRank)
                }
            )

            onConnect(this, sess)
            handleWs(sess)

            lfgServer.leavePost(user, sess.id, sess.joinedPostId)

            sess.joinedPostId = ""

            onDisconnect(this, sess)
        }
    }
}