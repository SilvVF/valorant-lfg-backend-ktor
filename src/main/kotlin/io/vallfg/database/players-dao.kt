package io.vallfg.database

import io.vallfg.types.PlayerData
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.transactions.experimental.suspendedTransactionAsync
import java.time.LocalDateTime


class PlayerDao(
    private val db: Database,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {
    suspend fun getPlayer(name: String, tag: String) =
        suspendedTransactionAsync(dispatcher, db) { PlayerEntity.findById(name + tag) }
    suspend fun updatePlayer(playerData: PlayerData) = suspendedTransactionAsync(dispatcher, db) {

        val pk = playerData.name + playerData.tag

        val entity = PlayerEntity.find { Players.id eq pk }.firstOrNull()

        entity?.apply {
            fromPlayerData(playerData)
            modifiedAt = LocalDateTime.now()
        }
    }
    suspend fun insertPlayer(playerData: PlayerData) = suspendedTransactionAsync(dispatcher, db) {

        val pk = playerData.name + playerData.tag

        PlayerEntity.new(pk) {
            fromPlayerData(playerData)
            modifiedAt = LocalDateTime.now()
            createdAt = LocalDateTime.now()
        }
    }

    private fun PlayerEntity.fromPlayerData(pd: PlayerData) {
        this.apply {
            name = pd.name
            tag = pd.tag
            seasonId= pd.seasonId
            seasonName= pd.seasonName
            playlist= pd.playlist
            rank= pd.rank
            iconUrl= pd.iconUrl
            matchesPlayed = pd.matchesPlayed
            matchWinPct= pd.matchWinPct
            kills= pd.kills
            killsPercentile= pd.killsPercentile
            killsPerRound= pd.killsPerRound
            killsPerMatch= pd.killsPerMatch
            scorePerRound= pd.scorePerRound
            scorePerRoundPercentile= pd.scorePerRoundPercentile
            assists= pd.assists
            assistsPerRound= pd.assistsPerRound
            assistsPerMatch= pd.assistsPerMatch
            kd= pd.kd
            kdPercentile = pd.kdPercentile
            kda = pd.kda
            dmgPerRound = pd.dmgPerRound
            headshotPct = pd.headshotPct
            headshotPctPercentile= pd.headshotPctPercentile
            econRating= pd.econRating
            firstBloodsPerMatch= pd.firstBloodsPerMatch
            firstDeathsPerRound = pd.firstDeathsPerRound
            mostKillsInMatch = pd.mostKillsInMatch
            timePlayed = pd.timePlayed
            trnPerformanceScore = pd.trnPerformanceScore
            peakRank = pd.peakRank
            peakRankIconUrl = pd.peakRankIconUrl
            peakRankActName = pd.peakRankActName
        }
    }
}