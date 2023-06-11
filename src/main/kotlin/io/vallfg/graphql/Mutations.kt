package io.vallfg.graphql

import com.expediagroup.graphql.server.operations.Mutation
import graphql.schema.DataFetchingEnvironment
import io.ktor.server.sessions.*
import io.vallfg.LfgContextFactory
import io.vallfg.getRankedDataOrNull
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.trn.getPlayerData
import io.vallfg.types.Player
import io.vallfg.types.PlayerData
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

        val player = Player(
            name = name,
            tag = tag,
            signedIn = true,
            data = getPlayerData(name, tag).getRankedDataOrNull()
                ?: error("could not find player")
        )

        sessionIdToPlayerData[session.id] = player
        return player
    }
}
