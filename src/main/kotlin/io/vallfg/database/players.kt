package io.vallfg.database


import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.sql.javatime.datetime


object Players : StringIdTable() {
    val name = text("name")
    val tag = text("tag")
    val seasonId = text("seasonId")
    val seasonName = text("seasonName")
    val playlist = text("playlist")
    val rank = text("rank")
    val iconUrl = text("iconUrl")
    val matchesPlayed = integer("matchesPlayed")
    val matchWinPct = double("matchWinPct")
    val kills = integer("kills")
    val killsPercentile= double("killsPercentile")
    val killsPerRound= double("killsPerRound")
    val killsPerMatch= double("killsPerMatch")
    val scorePerRound= double("scorePerRound")
    val scorePerRoundPercentile= double("scorePerRoundPercentile")
    val assists = integer("assists")
    val assistsPerRound= double("assistsPerRound")
    val assistsPerMatch= double("assistsPerMatch")
    val kd= double("kd")
    val kdPercentile= double("kdPercentile")
    val kda= double("kda")
    val dmgPerRound= double("dmgPerRound")
    val headshotPct= double("headshotPct")
    val headshotPctPercentile= double("headshotPctPercentile")
    val econRating= double("econRating")
    val firstBloodsPerMatch= double("firstBloodsPerMatch")
    val firstDeathsPerRound= double("firstDeathsPerRound")
    val mostKillsInMatch=integer("mostKillsInMatch")
    val timePlayed= integer("timePlayed")
    val trnPerformanceScore= double("trnPerformanceScore")
    val peakRank=text("peakRank")
    val peakRankIconUrl=text("peakRankIconUrl")
    val peakRankActName=text("peakRankActName")
    val createdAt = datetime("created_at")
    val modifiedAt = datetime("modified_at")
}


class PlayerEntity(id: EntityID<String>): Entity<String>(id)  {
    companion object : StringEntityClass<PlayerEntity>(Players)

    var name by Players.name
    var tag by Players.name
    var seasonId  by Players.seasonId
    var seasonName  by Players.seasonName
    var playlist  by Players.playlist
    var rank  by Players.rank
    var iconUrl  by Players.iconUrl
    var matchesPlayed  by Players.matchesPlayed
    var matchWinPct  by Players.matchWinPct
    var kills  by Players.kills
    var killsPercentile by Players.killsPercentile
    var killsPerRound by Players.killsPerRound
    var killsPerMatch by Players.killsPerMatch
    var scorePerRound by Players.scorePerRound
    var scorePerRoundPercentile by Players.scorePerRoundPercentile
    var assists  by Players.assists
    var assistsPerRound by Players.assistsPerRound
    var assistsPerMatch by Players.assistsPerMatch
    var kd by Players.kd
    var kdPercentile by Players.kdPercentile
    var kda by Players.kda
    var dmgPerRound by Players.dmgPerRound
    var headshotPct by Players.headshotPct
    var headshotPctPercentile by Players.headshotPctPercentile
    var econRating by Players.econRating
    var firstBloodsPerMatch by Players.firstBloodsPerMatch
    var firstDeathsPerRound by Players.firstDeathsPerRound
    var mostKillsInMatch by Players.mostKillsInMatch
    var timePlayed by Players.timePlayed
    var trnPerformanceScore by Players.trnPerformanceScore
    var peakRank by Players.peakRank
    var peakRankIconUrl by Players.peakRankIconUrl
    var peakRankActName by Players.peakRankActName
    var createdAt by Players.createdAt
    var modifiedAt by Players.modifiedAt
}
