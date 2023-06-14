package io.vallfg.database

import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction


lateinit var db: Database
fun Application.configureDb() {


    db = Database.connect(
        url = "jdbc:postgresql://db:5432/valplayerdb?user=valplayerdbuser",
        user = "valplayerdbuser",
        driver = "org.postgresql.Driver",
        password = "valplayerdbuserpassword"
    )

    transaction(db) {
        SchemaUtils.create(Players)
    }
}