package io.vallfg


import com.expediagroup.graphql.generator.TopLevelNames
import com.expediagroup.graphql.generator.extensions.plus
import com.expediagroup.graphql.server.ktor.DefaultKtorGraphQLContextFactory
import com.expediagroup.graphql.server.ktor.GraphQL
import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import com.expediagroup.graphql.server.ktor.graphiQLRoute
import graphql.GraphQLContext
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.vallfg.graphql.HelloWorldQuery
import io.vallfg.graphql.LoginAsPlayerMutation
import io.vallfg.handlers.loginHandler
import io.vallfg.lfg_server.LfgServer
import io.vallfg.lfg_server.lfgWebsocket
import io.vallfg.middleware.configureMiddleware
import kotlinx.serialization.json.Json
import org.slf4j.event.*


val json = Json {
    isLenient = true
    prettyPrint = true
    ignoreUnknownKeys = true
}

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

class LfgContextFactory : DefaultKtorGraphQLContextFactory() {
    override suspend fun generateContext(request: ApplicationRequest): GraphQLContext =
        super.generateContext(request).plus(
            mapOf(
                currentSessionsKey to request.call.sessions
            )
        )

    companion object {
        const val currentSessionsKey = "current_sessions_key"
    }
}

fun Application.module() {
    install(CallLogging) {
        level = Level.INFO
    }
    configureMiddleware()
    install(GraphQL) {
        schema {
            packages = listOf("io.vallfg")
            queries = listOf(
                HelloWorldQuery()
            )
            mutations = listOf(
                LoginAsPlayerMutation()
            )
            topLevelNames = TopLevelNames()
        }
        server {
            contextFactory = LfgContextFactory()
        }
    }
    routing {
        graphQLPostRoute(endpoint = "graphql")
        graphiQLRoute(endpoint = "graphiql", graphQLEndpoint = "graphql")
    }

    val server = LfgServer()

    lfgWebsocket(lfgServer = server) { conn, sessId, msg ->

    }
}


fun Application.configureRouting() {
    routing {
        authenticate("LFG_SESSION") {
            route("/create") {

            }
        }
        route("/login/{name}/{tag}") {
            get { loginHandler() }
        }
    }
}