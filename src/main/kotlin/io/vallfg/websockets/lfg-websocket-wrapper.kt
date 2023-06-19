package io.vallfg.websockets

import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.json
import io.vallfg.lfg_server.JoinPostError
import io.vallfg.lfg_server.PostId
import io.vallfg.lfg_server.User
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.types.Player
import kotlinx.coroutines.flow.receiveAsFlow

fun Application.lfgWebsocket(
    config: WebSockets.WebSocketOptions.() -> Unit = {
        maxFrameSize = Long.MAX_VALUE
    },
    onCreated: suspend (user: User, session: LfgSession, needed: Int, minRank: String, gameMode: String) -> Unit,
    onJoined: suspend (user: User, postId: PostId) -> JoinPostError,
    onDisconnect: suspend (user: User, session: LfgSession) -> Unit = { _, _ ->},
    onReceived: suspend (user: User, msg: InWsData) -> Unit,
) {

    install(WebSockets) { config() }

    routing {

        webSocket("/join/{postId}") {

            val args = call.parameters

            val postId: String = requireNotNull(args["postId"])

            val session = call.sessions.get<LfgSession>() ?: return@webSocket
            val player: Player = sessionIdToPlayerData[session.id] ?: return@webSocket

            val user =  User(
                this,
                player = player.toWsPlayerData(session.id),
            )

            when (onJoined(user, postId)) {
                JoinPostError.Banned -> error("Banned from joining post with id=$postId")
                JoinPostError.Full -> error("post with id=$postId is currently full")
                JoinPostError.NotFound -> error("post with id=$postId could not be found and may have been deleted")
                JoinPostError.RankToLow -> error("Unable to join post your rank is below the minimum")
                JoinPostError.None -> Unit
            }

            incoming.receiveAsFlow().collect {
                when (it) {
                    is Frame.Text -> {
                        runCatching {
                            val data = json.decodeFromString<InWsData>(it.readText())
                            data
                        }.onSuccess { wsData ->
                            onReceived(user, wsData)
                        }
                    }
                    else -> Unit
                }
            }
            onDisconnect(user, session)
        }

        webSocket("/create/{needed}/{minrank}/{gamemode}") {

            val args = call.parameters

            val needed: Int = requireNotNull(args["needed"]?.toIntOrNull())
            val minRank: String = requireNotNull(args["minRank"])
            val gameMode: String = requireNotNull(args["gameMode"])

            val session = call.sessions.get<LfgSession>() ?: return@webSocket

            val player: Player = sessionIdToPlayerData[session.id] ?: return@webSocket

            val user =  User(
                this,
                player = player.toWsPlayerData(session.id),
            )

            onCreated(
                user,
                session,
                needed, minRank, gameMode
            )

            incoming.receiveAsFlow().collect {
                when (it) {
                    is Frame.Text -> {
                        runCatching {
                            val data = json.decodeFromString<InWsData>(it.readText())
                            data
                        }.onSuccess { wsData ->
                            onReceived(user, wsData)
                        }
                    }
                    else -> Unit
                }
            }
            onDisconnect(user, session)
        }
    }
}
