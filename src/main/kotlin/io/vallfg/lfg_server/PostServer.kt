package io.vallfg.lfg_server

import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.Time
import io.vallfg.json
import io.vallfg.middleware.LfgSession
import io.vallfg.types.*
import io.vallfg.websockets.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.ZoneOffset


data class User(
    val conn: DefaultWebSocketServerSession,
    val player: WsPlayerData
)

data class MessageData(
    val messages: MutableList<Message> = mutableListOf(),
    val cooldownUntilEpochSeconds: Long = 0L,
)

class PostServer(
    val creator: User,
    var banned: List<ClientId> = emptyList(),
    var users: List<User> = emptyList(),
    val messageData: MutableMap<User, MessageData> = mutableMapOf(),
    var messages: List<Message> = emptyList(),
    val config: PostConfig,
    private val onClosed: () -> Unit,
) {
    suspend fun joinPost(
        user: User,
    ): JoinPostError {
        when {
            banned.any { it == user.player.clientId } -> JoinPostError.Banned
            users.size - 1 == config.needed -> JoinPostError.Full
            config.minRank.value > Rank.fromString(user.player.rank).value -> JoinPostError.RankToLow
        }
        users = users + user
        notifyAllExcept(
            user.conn,
            PlayerJoined(user.player)
        )
        return JoinPostError.None
    }

    suspend fun sendMessage(
        sender: User,
        message: String,
    ): MessageError {
        val epochSecond = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
        var data = messageData[sender]
        if (data != null) {
            when {
                data.cooldownUntilEpochSeconds > epochSecond -> {
                    return MessageError.OnCooldown(epochSecond - data.cooldownUntilEpochSeconds)
                }
                data.messages.size > 10 &&
                epochSecond - data.messages[data.messages.size - 10]
                    .sentAtEpochSecond < Time.second * 10 -> {
                    return MessageError.ToQuickly
                }
            }
        } else {
            data = MessageData()
            messageData[sender] = data
        }
        notifyAll(
            Message(
                text = message,
                sender = sender.player,
                sentAtEpochSecond = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
            ).also {
                data.messages.add(it)
            }
        )
        return MessageError.None
    }

    suspend fun banPlayer(
        initiator: User,
        bozo: WsPlayerData
    ): BanError {
        if (initiator == creator) {
           leavePost(bozo.clientId, ban = true)
           return BanError.None
        }
        return BanError.NotCreator
    }


    suspend fun leavePost(
        clientId: ClientId,
        ban: Boolean = false
    ) {
        val leaver = users.find { it.player.clientId == clientId } ?: return
        users = users.filter { it.player.clientId != clientId }
        if (ban) {
            banned = banned + clientId
        }
        notifyAll(
            PlayerLeft(
                player = leaver.player,
                banned = ban
            )
        )
        if (leaver.player.clientId == creator.player.clientId) {
            closePost(leaver.player.clientId)
        }
    }

    suspend fun closePost(
        closer: ClientId
    ) {
        if (closer == creator.player.clientId) {
            notifyAll(
                PostClosed(
                    creator.player,
                    users.map { it.player },
                    messages,
                    config.minRank.string,
                    config.needed,
                    config.gameMode.string
                )
            )
            onClosed.invoke()
        }
    }

    private suspend fun notifyAll(
        data: OutWsData
    ) = CoroutineScope(Dispatchers.IO).launch {
        for (user in users) {
            user.conn.send(
                Frame.Text(
                    json.encodeToString(OutWsData.serializer(), data)
                )
            )
        }
    }
   private suspend fun notifyAllExcept(
       ignore: DefaultWebSocketServerSession,
       data: OutWsData
   ) = CoroutineScope(Dispatchers.IO).launch {
       for (user in users) {
           if (user.conn != ignore) {
               user.conn.send(
                   Frame.Text(
                       json.encodeToString(OutWsData.serializer(), data)
                   )
               )
           }
       }
   }
}
sealed interface MessageError {
    object None: MessageError

    object PostNotFound: MessageError
    data class OnCooldown(val timeLeft: Long): MessageError

    object ToQuickly: MessageError
}
sealed interface BanError {
    object None: BanError

    object NotCreator: BanError
}

sealed interface JoinPostError {
    object Banned: JoinPostError

    object NotFound: JoinPostError

    object Full: JoinPostError

    object None: JoinPostError

    object RankToLow: JoinPostError
}