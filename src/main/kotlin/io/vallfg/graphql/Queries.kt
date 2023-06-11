package io.vallfg.graphql

import com.expediagroup.graphql.server.operations.Query

class HelloWorldQuery : Query {
    fun hello(): String = "Hello World!"
}