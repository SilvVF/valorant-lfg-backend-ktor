package io.vallfg.lfg_server

import io.ktor.server.application.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.Time
import io.vallfg.json
import io.vallfg.middleware.LfgSession
import io.vallfg.testUser
import io.vallfg.types.*
import io.vallfg.websockets.Message
import kotlinx.coroutines.*
import org.jetbrains.exposed.sql.Join
import java.lang.IllegalStateException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

typealias PostId = String
typealias ClientId = String
class LfgServer {

    val posts = ConcurrentHashMap<PostId, PostServer>()
    private val users = ConcurrentHashMap<ClientId, PostId>()
    private val deletePostJobs = ConcurrentHashMap<PostId, Job?>()


    suspend fun create(
        config: PostConfig,
        user: User
    ): PostId {

        // Leave Post if joined already
        users[user.player.clientId]?.let { joinedPost ->
            posts[joinedPost]?.leavePost(user.player.clientId)
        }
        // Create new post
        val postId = UUID.randomUUID().toString()

        val ps = PostServer(
            creator = user,
            users = listOf(user),
            config = config,
            onClosed = {
                posts.remove(postId)
                deletePostJobs[postId]?.cancel()
                deletePostJobs.remove(postId)
            }
        )

        posts[postId] = ps.also {
            deletePostJobs[postId] = CoroutineScope(Dispatchers.Default).launch {
                delay(Time.hour * 2)
                posts.remove(postId)
            }
        }

        users[user.player.clientId] = postId
        return postId
    }

    fun getPostForUser(user: User): PostServer? {
        val postId = users[user.player.clientId]
        return posts[postId]
    }
    suspend fun leave(
        user: User
    ) {
        val postId = users[user.player.clientId]
        posts[postId]?.leavePost(user.player.clientId)
        users.remove(user.player.clientId)
    }

    suspend fun join(
        postId: PostId,
        user: User
    ): JoinPostError {
        // Leave Post if joined already
        users[user.player.clientId]?.let { joinedPost ->
            posts[joinedPost]?.leavePost(user.player.clientId)
        }

        val post = posts[postId] ?: return JoinPostError.NotFound

        return post.joinPost(user)
    }
}