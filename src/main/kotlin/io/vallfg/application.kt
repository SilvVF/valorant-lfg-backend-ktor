package io.vallfg

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.vallfg.database.configureDb
import io.vallfg.graphql.configureGraphQL
import io.vallfg.handlers.configureRestRouting
import io.vallfg.lfg_server.LfgServer
import io.vallfg.middleware.configureMiddleware


fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}


fun Application.module() {

    val server = LfgServer(
        dev = true
    )

    configureDb()
    configureMiddleware()
    configureGraphQL(server)
    configureRestRouting()


    server.start(this@module)
}

