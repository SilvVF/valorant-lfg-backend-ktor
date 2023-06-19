package io.vallfg.websockets

import io.vallfg.lfg_server.ClientId
import io.vallfg.types.Player
import io.vallfg.types.PlayerData
import io.vallfg.types.toPlayer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
sealed interface OutWsData

@Serializable
sealed interface InWsData

@Serializable
@SerialName("BanPlayer")
data class BanPlayer(
    val player: WsPlayerData
): InWsData

@Serializable
@SerialName("SendMessage")
data class SendMessage(
    val text: String
): InWsData

@Serializable
@SerialName("ClosePost")
data class ClosePost(
    val reason: String
): InWsData

@Serializable
@SerialName("PostClosed")
data class PostClosed(
    val creator: WsPlayerData,
    var users: List<WsPlayerData> = emptyList(),
    var messages: List<Message> = emptyList(),
    val minRank: String,
    val needed: Int,
    val gameMode: String
): OutWsData

@Serializable
@SerialName("Message")
data class Message(
    val text: String,
    val sender: WsPlayerData,
    val sentAtEpochSecond: Long
): OutWsData

@Serializable
@SerialName("PostCreate")
data class PostCreate(
    val id: String,
): OutWsData

@Serializable
@SerialName("Error")
data class Error(
    val message: String,
): OutWsData

@Serializable
@SerialName("PostState")
data class PostState(
    val creator: WsPlayerData,
    var users: List<WsPlayerData> = emptyList(),
    var messages: List<Message> = emptyList(),
    val minRank: String,
    val needed: Int,
    val gameMode: String
): OutWsData

@Serializable
@SerialName("PlayerJoined")
data class PlayerJoined(
    val player: WsPlayerData,
): OutWsData

@Serializable
@SerialName("PlayerLeft")
data class PlayerLeft(
    val player: WsPlayerData,
    val banned: Boolean = false,
): OutWsData

@Serializable
data class WsPlayerData (
    val clientId: String,
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

fun Player.toWsPlayerData(clientId: ClientId): WsPlayerData {
    return WsPlayerData(
        clientId = clientId,
        name = this.data.name,
        tag = this.data.tag,
        seasonId = this.data.seasonId,
        seasonName = this.data.seasonName,
        playlist= this.data.playlist,
        rank= this.data.rank,
        iconUrl= this.data.iconUrl,
        matchesPlayed = this.data.matchesPlayed,
        matchWinPct= this.data.matchWinPct,
        kills= this.data.kills,
        killsPercentile= this.data.killsPercentile,
        killsPerRound= this.data.killsPerRound,
        killsPerMatch= this.data.killsPerMatch,
        scorePerRound= this.data.scorePerRound,
        scorePerRoundPercentile= this.data.scorePerRoundPercentile,
        assists= this.data.assists,
        assistsPerRound= this.data.assistsPerRound,
        assistsPerMatch= this.data.assistsPerMatch,
        kd= this.data.kd,
        kdPercentile = this.data.kdPercentile,
        kda = this.data.kda,
        dmgPerRound = this.data.dmgPerRound,
        headshotPct = this.data.headshotPct,
        headshotPctPercentile= this.data.headshotPctPercentile,
        econRating= this.data.econRating,
        firstBloodsPerMatch= this.data.firstBloodsPerMatch,
        firstDeathsPerRound = this.data.firstDeathsPerRound,
        mostKillsInMatch = this.data.mostKillsInMatch,
        timePlayed = this.data.timePlayed,
        trnPerformanceScore = this.data.trnPerformanceScore,
        peakRank = this.data.peakRank,
        peakRankIconUrl = this.data.peakRankIconUrl,
        peakRankActName = this.data.peakRankActName,
    )
}




