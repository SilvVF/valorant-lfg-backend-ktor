package io.vallfg.graphql

import graphql.GraphQLContext
import io.ktor.server.sessions.*
import io.vallfg.LfgContextFactory

inline fun <reified T> GraphQLContext.get(): T? {
    return when (T::class) {
        is CurrentSession -> get(LfgContextFactory.currentSessionsKey)
        else -> null
    }
}