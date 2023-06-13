package io.vallfg.graphql

import com.expediagroup.graphql.generator.TopLevelNames
import com.expediagroup.graphql.generator.extensions.plus
import com.expediagroup.graphql.server.ktor.DefaultKtorGraphQLContextFactory
import com.expediagroup.graphql.server.ktor.GraphQL
import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import com.expediagroup.graphql.server.ktor.graphiQLRoute
import graphql.GraphQLContext
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*


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
fun Application.configureGraphQL() {


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
}