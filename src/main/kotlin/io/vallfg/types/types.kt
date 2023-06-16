package io.vallfg.types

import io.vallfg.database.PlayerEntity


data class Player (
    val name: String,
    val tag: String,
    val signedIn: Boolean,
    val data: PlayerData
)

fun PlayerEntity.toPlayer(): Player {
    return Player(
        name = this.name,
        tag = this.tag,
        signedIn = true,
        data = PlayerData(
                name = this.name,
                tag = this.tag,
                seasonId = this.seasonId,
                seasonName = this.seasonName,
                playlist= this.playlist,
                rank= this.rank,
                iconUrl= this.iconUrl,
                matchesPlayed = this.matchesPlayed,
                matchWinPct= this.matchWinPct,
                kills= this.kills,
                killsPercentile= this.killsPercentile,
                killsPerRound= this.killsPerRound,
                killsPerMatch= this.killsPerMatch,
                scorePerRound= this.scorePerRound,
                scorePerRoundPercentile= this.scorePerRoundPercentile,
                assists= this.assists,
                assistsPerRound= this.assistsPerRound,
                assistsPerMatch= this.assistsPerMatch,
                kd= this.kd,
                kdPercentile = this.kdPercentile,
                kda = this.kda,
                dmgPerRound = this.dmgPerRound,
                headshotPct = this.headshotPct,
                headshotPctPercentile= this.headshotPctPercentile,
                econRating= this.econRating,
                firstBloodsPerMatch= this.firstBloodsPerMatch,
                firstDeathsPerRound = this.firstDeathsPerRound,
                mostKillsInMatch = this.mostKillsInMatch,
                timePlayed = this.timePlayed,
                trnPerformanceScore = this.trnPerformanceScore,
                peakRank = this.peakRank,
                peakRankIconUrl = this.peakRankIconUrl,
                peakRankActName = this.peakRankActName,
        )
    )
}

data class PlayerData (
    val name: String,
    val tag: String,
    val seasonId:  String,
    val seasonName:            String,
    val playlist:               String,
    val rank:                    String,
    val iconUrl:                 String,
    val matchesPlayed:           Int,
    val matchWinPct:            Double,
    val kills:                  Int,
    val killsPercentile:        Double,
    val killsPerRound:          Double,
    val killsPerMatch:           Double,
    val scorePerRound:          Double,
    val scorePerRoundPercentile:Double,
    val assists:                Int,
    val assistsPerRound:         Double,
    val assistsPerMatch:         Double,
    val kd:                      Double,
    val kdPercentile:           Double,
    val kda:                     Double,
    val dmgPerRound:            Double,
    val headshotPct:            Double,
    val headshotPctPercentile:   Double,
    val econRating:              Double,
    val firstBloodsPerMatch:    Double,
    val firstDeathsPerRound:     Double,
    val mostKillsInMatch:        Int,
    val timePlayed:              Int,
    val trnPerformanceScore:     Double,
    val peakRank:                String,
    val peakRankIconUrl:        String,
    val peakRankActName:         String,
)

data class Post(
    val id: String,
    val minRank: String,
    val gameMode: String,
    val needed: Int,
    val players: List<List<String>>,
    val createdAt: String,
)