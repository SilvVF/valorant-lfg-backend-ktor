package io.vallfg.middleware

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.response.*
import io.ktor.server.sessions.*
import io.ktor.util.pipeline.*
import io.vallfg.Time
import io.vallfg.lfg_server.ClientId
import io.vallfg.lfg_server.PostId
import io.vallfg.types.Player
import io.vallfg.types.PlayerData
import org.slf4j.event.Level
import java.util.concurrent.ConcurrentHashMap

data class LfgSession(
    val id: ClientId,
    var joinedPostId: PostId
): Principal

typealias SessionStore = ConcurrentHashMap<String, Player>

val sessionIdToPlayerData: SessionStore = ConcurrentHashMap<String, Player>()

fun Application.configureMiddleware() {

        install(CallLogging) {
            level = Level.INFO
        }


        install(Sessions) {
            cookie<LfgSession>("LFG_SESSION", SessionStorageMemory()) {
                cookie.extensions["SameSite"] = "lax"
                cookie.maxAgeInSeconds = Time.day * 2
                cookie.secure = false
                cookie.httpOnly = false
            }
        }
}