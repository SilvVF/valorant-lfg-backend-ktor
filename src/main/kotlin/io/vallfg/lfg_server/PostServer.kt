package io.vallfg.lfg_server

import io.ktor.server.websocket.*
import io.vallfg.trn.player_data.Rank
import io.vallfg.types.Message
import io.vallfg.types.Player
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock


data class User(
    val conn: DefaultWebSocketServerSession,
    val player: Player,
)

class PostConfig {

    var minRank: String = "Unranked"
        private set
    var needed: Int = 1
        private set
    var gameMode: String = "Competitive"
        private set

    class Builder(private val postConfig: PostConfig = PostConfig()) {

        fun setMinRank(rank: String): PostConfig.Builder {
            this.postConfig.minRank = rank
            return this
        }

        fun setNeeded(need: Int): PostConfig.Builder {
            this.postConfig.needed = need
            return this
        }

        fun setGameMode(gameMode: String): PostConfig.Builder {
            this.postConfig.gameMode = gameMode
            return this
        }

        fun build(): PostConfig {
            return postConfig
        }
    }
}

class PostServer(
    private val creator: User,
    private val banned: MutableList<User> = mutableListOf(),
    private val users: MutableList<User>,
    private val messages: MutableList<Message> = mutableListOf(),
    private val config: PostConfig
) {

    private val mutex: Mutex = Mutex()

   suspend fun joinPost(user: User): Boolean = mutex.withLock {
       users.add(user)
   }

   suspend fun leavePost(user: User) = mutex.withLock {
       users.remove(user)
   }
}