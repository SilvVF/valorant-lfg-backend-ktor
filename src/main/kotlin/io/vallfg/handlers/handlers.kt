package io.vallfg.handlers

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.sessions.*
import io.ktor.util.pipeline.*
import io.vallfg.middleware.LfgSession
import io.vallfg.middleware.sessionIdToPlayerData
import io.vallfg.responses.LoginResponse
import io.vallfg.trn.getPlayerData
import io.vallfg.trn.player_data.toPlayerData
import java.util.*

suspend fun PipelineContext<Unit, ApplicationCall>.loginHandler() {
    suspend fun badRequest() {
        call.respond(HttpStatusCode.BadRequest)
        return
    }

    val args = call.parameters

    val name = args["name"].toString()
    val tag = args["tag"].toString()

    if (name.isBlank() || tag.isBlank()) {
        badRequest()
    }

    val data = getPlayerData(name, tag)
        .getOrNull()
        ?.segments
        ?.first()
        ?.toPlayerData()

    if (data == null) {
        call.respondText(
            status = HttpStatusCode.OK,
            text = "Unable to find player name=$name, tag=$tag"
        )
        return
    }

    val session = call.principal<LfgSession>() ?: LfgSession(id = UUID.randomUUID().toString())

    call.sessions.set(session)

    sessionIdToPlayerData[session.id] = data

    call.respond(
        status = HttpStatusCode.OK,
        message = LoginResponse(
            statusCode = HttpStatusCode.OK.value,
            ok = true,
            player = data
        ),
    )
}