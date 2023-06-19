package io.vallfg.websockets

import io.ktor.server.application.*
import io.vallfg.lfg_server.*

fun Application.configureWebsocket(
    server: LfgServer
) {
    lfgWebsocket(
        onCreated = { user, session, needed, minRank, gameMode ->
            server.createPost(
                  config = PostConfig(
                      minRank = Rank.fromString(minRank),
                      needed = needed,
                      gameMode = GameMode.fromString(gameMode)
                  ),
                  user = user
            ).also { id ->
                session.joinedPostId = id
            }
        },
        onDisconnect = { user, session ->
            session.joinedPostId = ""
        }
    ) { user, session, msg ->
        when (msg) {

            else -> {}
        }
    }
}