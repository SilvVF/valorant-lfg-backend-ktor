package io.vallfg.lfg_server

import io.ktor.server.application.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.middleware.LfgSession
import io.vallfg.testUser
import io.vallfg.types.Message
import io.vallfg.types.Player
import io.vallfg.types.PlayerData
import java.lang.IllegalStateException
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

typealias PostId = String
typealias ClientId = String
class LfgServer(
    val dev: Boolean
) {
    val posts = ConcurrentHashMap<PostId, PostServer>()
    val users = ConcurrentHashMap<ClientId, PostId>()

    init {
        if (dev) {
            repeat(100) {

                val  id = UUID.randomUUID().toString()

                posts[id] = PostServer(
                    users = mutableListOf(testUser),
                    creator = testUser,
                    config = PostConfig.Builder()
                        .setGameMode(listOf("competitive", "unrated").random())
                        .setNeeded((1..4).random())
                        .setMinRank(listOf("Immortal1", "Unranked","Diamond3").random())
                        .build()
                )
            }
        }
    }


    fun start(app: Application) = app.configureLfgWebsockets(
            onJoined = { user, postId ->
                joinPost(user, user.session.id, postId)
                    .onSuccess {
                        user.session.joinedPostId = postId
                    }
                    .onFailure {
                        user.conn.close(
                            CloseReason(
                                code = CloseReason.Codes.VIOLATED_POLICY,
                                message = "failed to join post with postId=[$postId]"
                            )
                        )
                    }
            },
            onCreated = { user, needed, minRank, gameMode ->
                createPost(
                    user = user,
                    clientId = user.session.id,
                    config =  {
                        setGameMode(gameMode)
                        setNeeded(needed)
                        setMinRank(minRank)
                    }
                )
                    .onSuccess { postId ->
                        user.session.joinedPostId = postId
                    }
            },
            onDisconnect = { user ->

            },
            onReceived = { user, msg ->
                when(msg){
                    is Message -> TODO()
                }
            }
    )

    private suspend fun createPost(
        user: User,
        clientId: ClientId,
        config: PostConfig.Builder.() -> Unit
    ): Result<String> {

        val postId = UUID.randomUUID().toString()

        posts[postId] = PostServer(
            creator = user,
            users = mutableListOf(user),
            config = PostConfig.Builder().apply(config).build()
        )
        users[clientId] = postId

        return Result.success(postId)
    }

    private suspend fun joinPost(user: User, clientId: ClientId, postId: PostId): Result<Boolean> {

        val joined = posts[postId]
            ?.joinPost(user)
            ?: return Result.failure(IllegalStateException())

        if (!joined) {
            return Result.failure(IllegalStateException())
        }

        users[clientId] = postId

        return Result.success(true)
    }

    suspend fun leavePost(user: User, clientId: ClientId, postId: PostId): Boolean {

        posts[postId]?.leavePost(user)

        users.remove(clientId)

        return true
    }
}
