package io.vallfg.trn.player_data

import io.vallfg.types.PlayerData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TrnPlayerData (

    @SerialName("segments" ) var segments : ArrayList<Segments> = arrayListOf()

)

fun Segments.toPlayerData(
    name: String,
    tag: String
): PlayerData? = if (metadata != null && stats != null) {
    PlayerData(
        name = name,
        tag = tag,
        seasonId = metadata.actId ?: "",
        seasonName = metadata.actName ?: "" ,
        playlist = attributes?.playlist ?: "",
        rank = stats.rank?.metadata?.tierName ?: "",
        iconUrl = stats.rank?.metadata?.iconUrl ?: "",
        matchesPlayed = stats.matchesPlayed?.value ?: 0,
        matchWinPct = stats.matchesWinPct?.value ?: 0.0,
        kills = stats.kills?.value ?: 0,
        killsPercentile = stats.kills?.percentile ?: 0.0,
        killsPerMatch = stats.killsPerMatch?.value ?: 0.0,
        killsPerRound = stats.killsPerRound?.value ?: 0.0,
        scorePerRound = stats.scorePerRound?.value ?: 0.0,
        assists = stats.assists?.value ?: 0,
        scorePerRoundPercentile = stats.scorePerRound?.percentile ?: 0.0,
        assistsPerMatch = stats.assistsPerMatch?.value ?: 0.0,
        assistsPerRound = stats.assistsPerRound?.value ?: 0.0,
        kd = stats.kDRatio?.value ?: 0.0,
        kdPercentile = stats.kDRatio?.percentile ?: 0.0,
        kda = stats.kDARatio?.value ?: 0.0,
        dmgPerRound = stats.damagePerRound?.value ?: 0.0,
        headshotPct = stats.headshotsPercentage?.value ?: 0.0,
        headshotPctPercentile = stats.headshotsPercentage?.percentile ?: 0.0,
        econRating = stats.econRating?.value ?: 0.0,
        firstBloodsPerMatch = stats.firstBloodsPerMatch?.value ?: 0.0,
        firstDeathsPerRound = stats.firstDeathsPerRound?.value ?: 0.0,
        mostKillsInMatch = stats.mostKillsInMatch?.value ?: 0,
        timePlayed = stats.timePlayed?.value ?: 0,
        trnPerformanceScore = stats.trnPerformanceScore?.value ?: 0.0,
        peakRank = stats.peakRank?.metadata?.tierName ?: "Unranked",
        peakRankIconUrl = stats.peakRank?.metadata?.iconUrl ?: "",
        peakRankActName = stats.peakRank?.metadata?.actName ?: ""
    )
} else {
    null
}