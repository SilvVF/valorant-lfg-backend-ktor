package vallfg.io

import com.apurebase.kgraphql.GraphQL
import com.apurebase.kgraphql.KGraphQL
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import vallfg.io.plugins.*
import vallfg.io.trn.getPlayerData

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
            .start(wait = true)
}

fun Application.module() {


    routing {
        route("/") {
            get {
                call.respond(
                    getPlayerData("silv", "004").segments[0]
                        .also { println(it) }
                )
            }
        }
    }
//    install(GraphQL) {
//        configureRouting()
//        playground = true
//        endpoint = "/"
//        schema
//    }
}


//val schema = KGraphQL.schema {
//    //configure method allows you customize schema behaviour
//    configure {
//        useDefaultPrettyPrinter = true
//    }
//
//    // create query "hero" which returns instance of Character
//    query("hero") {
//        resolver { s: String ->
//            s
//        }
//    }
//
//    // 1kotlin classes need to be registered with "type" method
//    // to be included in created schema type system
//    // class Character is automatically included,
//    // as it is return type of both created queries
////    type<Droid>()
////    type<Human>()
////    enum<Episode>()
//}