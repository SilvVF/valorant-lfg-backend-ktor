package io.vallfg.middleware

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.sessions.*
import io.vallfg.Time
import io.vallfg.types.PlayerData
import java.util.concurrent.ConcurrentHashMap

data class LfgSession(
    val id: String,
): Principal

typealias SessionStore = ConcurrentHashMap<String, PlayerData>

val sessionIdToPlayerData: SessionStore = ConcurrentHashMap<String, PlayerData>()

fun Application.configureMiddleware() {

        install(Authentication) {
            session<LfgSession>("LFG_SESSION") {
                validate { it }
                challenge {
                    call.respond(HttpStatusCode.BadRequest, message = "session not set")
                }
            }
        }

        install(Sessions) {
            cookie<LfgSession>("LFG_SESSION") {
                cookie.extensions["SameSite"] = "lax"
                cookie.maxAgeInSeconds = Time.day * 2
            }
        }
}