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
import io.vallfg.lfg_server.LfgServer


class LfgContextFactory(
    private val lfgServer: LfgServer
) : DefaultKtorGraphQLContextFactory() {
    override suspend fun generateContext(request: ApplicationRequest): GraphQLContext =
        super.generateContext(request).plus(
            mapOf(
                currentSessionsKey to request.call.sessions,
                lfgServerPostsKey to lfgServer.posts
            )
        )
    companion object {
        const val currentSessionsKey = "current_sessions_key"
        const val lfgServerPostsKey = "lfg_server_posts_key"
    }
}
fun Application.configureGraphQL(lfgServer: LfgServer) {


    install(GraphQL) {
        schema {
            packages = listOf("io.vallfg")
            queries = listOf(
                PlayerQuery(), PostQuery()
            )
            mutations = listOf(
                LoginAsPlayerMutation()
            )
            topLevelNames = TopLevelNames()
        }
        server {
            contextFactory = LfgContextFactory(lfgServer)
        }
    }
    routing {
        graphQLPostRoute(endpoint = "graphql")
        graphiQLRoute(endpoint = "graphiql", graphQLEndpoint = "graphql")
    }
}