package io.vallfg.lfg_server

import io.ktor.server.websocket.*
import io.vallfg.middleware.LfgSession
import io.vallfg.types.Message
import io.vallfg.types.Player
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock


data class User(
    val conn: DefaultWebSocketServerSession,
    val player: Player,
    val session: LfgSession
)


class PostServer(
    private val creator: User,
    private val banned: MutableList<User> = mutableListOf(),
    val users: MutableList<User>,
    private val messages: MutableList<Message> = mutableListOf(),
    val config: PostConfig
) {

    private val mutex: Mutex = Mutex()

   suspend fun joinPost(user: User): Boolean = mutex.withLock {
       users.add(user)
   }

   suspend fun leavePost(user: User) = mutex.withLock {
       users.remove(user)
   }
}