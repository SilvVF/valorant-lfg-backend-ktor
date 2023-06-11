package io.vallfg.lfg_server

import io.vallfg.types.Player
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

typealias PostId = String
typealias ClientId = String
class LfgServer {

    private val posts = ConcurrentHashMap<PostId, PostServer>()
    private val users = ConcurrentHashMap<ClientId, PostId>()

    suspend fun createPost(
        user: User,
        clientId: ClientId,
        config: PostConfig.Builder.() -> Unit
    ): PostId {
        val postId = UUID.randomUUID().toString()

        posts[postId] = PostServer(
            creator = user,
            users = mutableListOf(user),
            config = PostConfig.Builder().apply(config).build()
        )
        users[clientId] = postId

        return postId
    }

    suspend fun joinPost(user: User, clientId: ClientId, postId: PostId): PostId {

        posts[postId]?.joinPost(user)

        users[clientId] = postId

        return postId
    }

    suspend fun leavePost(user: User, clientId: ClientId, postId: PostId): Boolean {

        posts[postId]?.leavePost(user)

        users.remove(clientId)

        return true
    }
}
