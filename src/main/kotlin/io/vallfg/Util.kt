package io.vallfg

import graphql.schema.AsyncDataFetcher.async
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.websocket.*
import io.ktor.util.*
import io.ktor.websocket.*
import io.vallfg.lfg_server.User
import io.vallfg.middleware.LfgSession
import io.vallfg.types.PlayerData
import io.vallfg.trn.player_data.TrnPlayerData
import io.vallfg.trn.player_data.toPlayerData
import io.vallfg.types.Player
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.serialization.json.Json
import kotlin.coroutines.CoroutineContext

/**
 * Util Object for getting different times in seconds.
 */
object Time {

    const val second: Long = 1L

    const val minute: Long = Time.second * 60L

    const val hour: Long = Time.minute * 60L

    const val day: Long = Time.hour * 24L
}


fun Result<TrnPlayerData>.getRankedDataOrNull(name: String, tag: String): PlayerData? {
    return this.getOrNull()
        ?.segments
        ?.first()
        ?.toPlayerData(name, tag)
}

val json = Json {
    isLenient = true
    prettyPrint = true
    ignoreUnknownKeys = true
}

val testUser = User(
        session = LfgSession("sdkjfakj", "dfkjakflj"),
        player = Player(
            name = "Silv",
            tag = "004",
            signedIn = true,
            data = PlayerData(
                name = "silv",
                tag = "004",
                kd = 1.4,
                kda = 1.4,
                headshotPct = 22.0,
                matchWinPct = 22.33,
                matchesPlayed = 2,
                killsPerMatch = 23.0,
                mostKillsInMatch = 55,
                rank = "Unranked",
                iconUrl = "https://trackercdn.com/cdn/tracker.gg/valorant/icons/tiersv2/0.png",
                trnPerformanceScore = 978.0,
                kills = 2344,
                killsPercentile = 10.00,
                killsPerRound = 2.21,
                playlist = "Ranked",
                seasonName = "Act 2 Season 3",
                seasonId = "398745982379827",
                scorePerRound = 235.34,
                scorePerRoundPercentile = 39.00,
                assists = 123,
                assistsPerMatch = 6.0,
                assistsPerRound = 1.0,
                peakRank = "DiamondIII",
                peakRankActName = "Act 2 Season 2",
                firstDeathsPerRound = 0.0,
                kdPercentile = 99.00,
                dmgPerRound = 99.0,
                headshotPctPercentile = 99.0,
                econRating = 344.0,
                firstBloodsPerMatch = 4.0,
                timePlayed = 342,
                peakRankIconUrl = "https://trackercdn.com/cdn/tracker.gg/valorant/icons/tiersv2/20.png"
            ),
        ),
    conn = TestSession()
)

class TestSession(
    override val call: ApplicationCall = object : ApplicationCall {
        override val application: Application
            get() = TODO("Not yet implemented")
        override val attributes: Attributes
            get() = TODO("Not yet implemented")
        override val parameters: Parameters
            get() = TODO("Not yet implemented")
        override val request: ApplicationRequest
            get() = TODO("Not yet implemented")
        override val response: ApplicationResponse
            get() = TODO("Not yet implemented")

    },
    override val closeReason: Deferred<CloseReason?> = runBlocking { async<CloseReason?> { null } },
    override var pingIntervalMillis: Long = 0L,
    override var timeoutMillis: Long = 0L,
    override val extensions: List<WebSocketExtension<*>> = emptyList(),
    override val incoming: ReceiveChannel<Frame> = Channel(),
    override var masking: Boolean = false,
    override var maxFrameSize: Long = 0L,
    override val outgoing: SendChannel<Frame> = Channel(),
    override val coroutineContext: CoroutineContext = Dispatchers.IO
) : DefaultWebSocketServerSession {
    override suspend fun flush() {

    }
    @InternalAPI
    override fun start(negotiatedExtensions: List<WebSocketExtension<*>>) {

    }

    override fun terminate() {

    }
}

