package io.vallfg.types


data class Player (
    val name: String,
    val tag: String,
    val signedIn: Boolean,
    val data: PlayerData
)
data class PlayerData (
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