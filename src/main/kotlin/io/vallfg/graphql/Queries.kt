package io.vallfg.graphql

import com.expediagroup.graphql.generator.extensions.get
import com.expediagroup.graphql.server.operations.Query
import graphql.schema.DataFetchingEnvironment
import io.vallfg.Time
import io.vallfg.database.PlayerEntity
import io.vallfg.database.playerDao
import io.vallfg.lfg_server.PostId
import io.vallfg.lfg_server.PostServer
import io.vallfg.types.Player
import io.vallfg.types.Post
import io.vallfg.types.toPlayer
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class PlayerQuery : Query {
    suspend fun player(
        name: String,
        tag: String
    ): Player? = playerDao.getPlayer(name, tag)
        .await().also { updateIfNeeded(it) }
        ?.toPlayer()
}

private suspend fun updateIfNeeded(playerEntity: PlayerEntity?) {
    playerEntity?.let {
        val secondsSinceModified =  it.modifiedAt.toEpochSecond(ZoneOffset.UTC) - LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)
        if (secondsSinceModified > Time.day) {
            val entity = playerDao.updatePlayer(
                playerEntity.toPlayer().data
            )
        }
    }
}

class PostQuery: Query {
    suspend fun posts(
        amount: Int,
        offset: Int,
        ctx: DataFetchingEnvironment,
    ): List<Post> {

        val posts = ctx.graphQlContext
            .get<Map<PostId, PostServer>>(LfgContextFactory.lfgServerPostsKey)
            .toList()


        if (posts.lastIndex < amount + offset) {
            return posts.map(::toPost)
        }

        return posts.subList(offset, offset + amount).map(::toPost)
    }

    private fun toPost(postMapValue: Pair<PostId, PostServer>): Post {
        val postServer = postMapValue.second
        val id = postMapValue.first
        val config = postServer.config
        return Post(
            id = id,
            minRank = config.minRank.string,
            gameMode = config.gameMode.string,
            needed = config.needed,
            players = postServer.users.map { listOf(it.player.name, it.player.tag) },
            createdAtEpochSecond = postServer.config.createdAt.toEpochSecond(ZoneOffset.UTC).toDouble()
        )
    }
}
