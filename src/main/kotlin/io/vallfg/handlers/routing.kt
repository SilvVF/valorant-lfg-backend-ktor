package io.vallfg.handlers

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRestRouting() {
    routing {
        route("/login/{name}/{tag}") {
            get { loginHandler() }
        }
    }
}