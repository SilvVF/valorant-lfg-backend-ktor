package io.vallfg.lfg_server

import io.ktor.serialization.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.plugins.*
import io.ktor.server.routing.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.types.Player
import io.vallfg.types.WsData
import java.time.Duration

fun Application.lfgWebsocket(
    config: WebSockets.WebSocketOptions.() -> Unit = {
        pingPeriod = Duration.ofSeconds(15)
        timeout = Duration.ofSeconds(15)
        maxFrameSize = Long.MAX_VALUE
        masking = false
    },
    onCreated: suspend (user: User, needed: Int, minRank: String, gameMode: String) -> Unit,
    onJoined: suspend (user: User,  postId: String) -> Unit,
    onDisconnect: suspend (user: User,) -> Unit = {_ ->},
    onReceived: suspend (user: User, msg: WsData) -> Unit,
) {

    install(WebSockets) { config() }

    routing {
        webSocket("/join/{id}") {
            val args = call.parameters

            val postId: String = args["id"] ?: return@webSocket
            val sess = call.principal<LfgSession>() ?: return@webSocket
            val playerData: Player = sessionIdToPlayerData[sess.id] ?: return@webSocket

            val user  = User(
                conn = this,
                player = playerData,
                session = sess
            )

            onJoined(user, postId)

            try {
                receiveWsData { data ->
                    onReceived(user, data)
                }
            } finally {
                onDisconnect(user)
            }

        }


        webSocket("/create/{needed}/{minrank}/{gamemode}") {
            val args = call.parameters

            val needed: Int = args["needed"]?.toIntOrNull() ?: return@webSocket
            val minRank: String = args["minrank"] ?: return@webSocket
            val gameMode: String = args["gamemode"] ?: return@webSocket

            val sess = call.principal<LfgSession>() ?: return@webSocket

            val playerData: Player = sessionIdToPlayerData[sess.id] ?: return@webSocket

            val user  = User(
                conn = this,
                player = playerData,
                session = sess
            )

            onCreated(user, needed, minRank, gameMode)

            try {
                receiveWsData { data ->
                    onReceived(user, data)
                }
            } finally {
                onDisconnect(user)
            }
        }
    }
}

/**
 * Receives [Frame] from the [DefaultWebSocketServerSession.incoming] flow and emits [WsData].
 * Function Suspends until the incoming receive channel throws ClosedReceiveChannelException or cancelled.
 * This function handles any exception thrown when deserializing incoming Frames.
 * @param onReceived Called after successfully deserializing [Frame.Text] into [WsData].
 *
 */
suspend fun DefaultWebSocketServerSession.receiveWsData(
    onReceived: suspend (data: WsData) -> Unit
)  {
    for (frame in incoming) {
        when (frame) {
            is Frame.Text, is Frame.Binary -> {
                try {
                    onReceived(
                        receiveDeserialized<WsData>()
                    )
                } catch (e: WebsocketDeserializeException) {
                    e.printStackTrace()
                } catch (e: WebsocketConverterNotFoundException) {
                    e.printStackTrace()
                }
            }
            is Frame.Ping, is Frame.Close, is Frame.Pong -> Unit
        }
    }
}