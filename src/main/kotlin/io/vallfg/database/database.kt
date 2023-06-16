package io.vallfg.database

import io.ktor.server.application.*
import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IdTable
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction




lateinit var playerDao: PlayerDao

fun Application.configureDb() {

    val db = Database.connect(
        url = "jdbc:postgresql://db:5432/valplayerdb?user=valplayerdbuser",
        user = "valplayerdbuser",
        driver = "org.postgresql.Driver",
        password = "valplayerdbuserpassword"
    )

    transaction(db) {
        SchemaUtils.create(Players)
    }

    playerDao = PlayerDao(db)
}

/*
 * Base class for entities with string id
 */
abstract class StringEntityClass<out E: Entity<String>>(table: IdTable<String>, entityType: Class<E>? = null) : EntityClass<String, E>(table, entityType)

/*
 * Base class for table objects with string id
 */
open class StringIdTable(name: String = "", columnName: String = "id", columnLength: Int = 25) : IdTable<String>(name) {
    override val id: Column<EntityID<String>> = varchar(columnName, columnLength).entityId()
    override val primaryKey by lazy { super.primaryKey ?: PrimaryKey(id) }
}