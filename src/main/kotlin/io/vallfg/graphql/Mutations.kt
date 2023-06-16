package io.vallfg.graphql

import com.expediagroup.graphql.server.operations.Mutation
import graphql.schema.DataFetchingEnvironment
import io.ktor.server.sessions.*
import io.vallfg.database.playerDao
import io.vallfg.getRankedDataOrNull
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.trn.getPlayerData
import io.vallfg.types.Player
import java.util.UUID


class LoginAsPlayerMutation: Mutation {

    suspend fun loginAsPlayer(
        ctx: DataFetchingEnvironment,
        name: String,
        tag: String
    ): Player {

        val sessions: CurrentSession = ctx.graphQlContext.get(LfgContextFactory.currentSessionsKey)
            ?: error("unable to get current session")

        val session: LfgSession = sessions.get<LfgSession>() ?: run {
            val newSession = LfgSession(id = UUID.randomUUID().toString(), "")
            sessions.set("LFG_SESSION", newSession)
            return@run newSession
        }

        val playerData = getPlayerData(name, tag).getRankedDataOrNull(name, tag)
            ?: error("could not find player")

        val entity = playerDao.insertPlayer(playerData)

        val player = Player(
            name = name,
            tag = tag,
            signedIn = true,
            data = playerData
        )

        sessionIdToPlayerData[session.id] = player
        return player
    }
}
