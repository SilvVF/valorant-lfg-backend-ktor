package io.vallfg.graphql

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.generator.federation.directives.ContactDirective
import com.expediagroup.graphql.server.Schema
import com.expediagroup.graphql.server.operations.Mutation
import com.expediagroup.graphql.server.operations.Query
import graphql.schema.DataFetchingEnvironment
import io.ktor.client.engine.*
import io.ktor.server.sessions.*
import io.vallfg.getRankedDataOrNull
import io.vallfg.trn.getPlayerData
import io.vallfg.types.PlayerData

@GraphQLDescription("My schema description")
class LfgSchema : Schema





