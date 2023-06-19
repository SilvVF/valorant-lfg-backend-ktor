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
    val users = ConcurrentHashMap<ClientId, PostId>()
    val deletePostJobs = ConcurrentHashMap<PostId, Job?>()


    suspend fun createPost(
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
            config = config
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

    suspend fun leavePost(
        postId: PostId,
        user: User
    ) {
        posts[postId]?.leavePost(user.player.clientId)
        users.remove(user.player.clientId)
    }

    suspend fun sendMessage(
        text: String,
        user: User
    ): MessageError {

        val postId = users[user.player.clientId]
        val post = posts[postId] ?: return MessageError.PostNotFound

        return post.sendMessage(user, text)
    }
    suspend fun joinPost(
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