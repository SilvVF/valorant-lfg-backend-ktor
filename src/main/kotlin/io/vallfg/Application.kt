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
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import io.vallfg.graphql.HelloWorldQuery
import io.vallfg.graphql.LoginAsPlayerMutation
import io.vallfg.handlers.loginHandler
import io.vallfg.middleware.configureMiddleware
import io.vallfg.trn.getPlayerData
import io.vallfg.types.Message
import io.vallfg.types.WsData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import java.time.Duration


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
    install(WebSockets) {
        pingPeriod = Duration.ofSeconds(15)
        timeout = Duration.ofSeconds(15)
        maxFrameSize = Long.MAX_VALUE
        masking = false
    }
    configureWs()
}

fun Application.configureWs() {
    routing {
            webSocket("/create/{needed}/{minrank}/{gamemode}") {
                val args = call.parameters

                val needed: Int  = args["needed"]?.toIntOrNull() ?: return@webSocket
                val minRank: String = args["minrank"] ?: return@webSocket
                val gameMode: String = args["gamemode"] ?: return@webSocket

                //val sessId = call.principal<LfgSession>()?.id ?: return@webSocket

                //val playerData: PlayerData = sessionIdToPlayerData[sessId] ?: return@webSocket
                CoroutineScope(Dispatchers.IO).launch {
                    while (true) {
                        delay(2000)
                        send(
                            Frame.Text(
                                WsData.toString() +
                                Message("lo").toString()
                            )
                        )
                    }
                }

                for (frame in incoming) {
                    when (frame) {
                        is Frame.Text -> {
                            try {
                                val wsData = Json.decodeFromString<WsData>(frame.readText())

                                send(Frame.Text(wsData.toString()))

                            } catch (e: Exception) {
                                e.printStackTrace()
                            }

                        }
                        else -> {

                        }
                    }
                }
        }
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