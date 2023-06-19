package io.vallfg.websockets

import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.json
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
    onDisconnect: suspend (user: User, session: LfgSession) -> Unit = { _, _ ->},
    onReceived: suspend (user: User, session: LfgSession, msg: InWsData) -> Unit,
) {

    install(WebSockets) { config() }

    routing {
        data class CreatParams(
            val needed: Int,
            val minRank: String,
            val gameMode: String
        )

        webSocket("/create/{needed}/{minrank}/{gamemode}") {

            val args = call.parameters

            val needed: Int = requireNotNull(args["needed"]?.toIntOrNull())
            val minRank: String =requireNotNull(args["minRank"])
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
                            onReceived(user,session, wsData)
                        }
                    }
                    else -> Unit
                }
            }
            onDisconnect(user, session)
        }
    }
}
