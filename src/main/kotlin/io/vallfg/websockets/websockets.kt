package io.vallfg.websockets

import io.ktor.server.application.*
import io.ktor.websocket.*
import io.vallfg.json
import io.vallfg.lfg_server.*
fun Application.configureWebsocket(
    server: LfgServer
) {
    lfgWebsocket(
        onCreated = { user, session, needed, minRank, gameMode ->
            server.create(
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
        onJoined = { user, postId ->
            server.join(postId, user)
        },
        onDisconnect = { user, session ->
            server.leave(user)
            session.joinedPostId = ""
        }
    ) { user, msg ->
        val post = server.getPostForUser(user) ?: return@lfgWebsocket
        when (msg) {
            is BanPlayer -> {
                val error = post.banPlayer(
                    user,
                    msg.player
                )
                when (error) {
                    BanError.NotCreator -> user.conn.send(
                        Frame.Text(
                            json.encodeToString(
                                OutWsData.serializer(),
                                Error("Unable to ban player")
                            )
                        )
                    )
                    BanError.None -> Unit
                }
            }
            is ClosePost -> {
                post.closePost(user.player.clientId)
            }
            is SendMessage -> {
                val error = post.sendMessage(user, msg.text)
                user.conn.send(
                    Frame.Text(
                        json.encodeToString(
                            OutWsData.serializer(),
                            when (error) {
                                MessageError.None -> return@lfgWebsocket
                                is MessageError.OnCooldown -> Error(
                                    "On cooldown for ${error.timeLeft} seconds"
                                )
                                MessageError.PostNotFound -> Error(
                                    "Unable to send message"
                                )
                                MessageError.ToQuickly -> Error(
                                    "You are sending to quickly"
                                )
                            }
                        )
                    )
                )
            }
        }
    }
}