package io.vallfg.lfg_server

import java.time.LocalDateTime


sealed class Rank(val value: Int, val string: String) {
    object Radiant: Rank(25, string = "Radiant")
    object Immortal3: Rank(24, string = "Immortal III")
    object Immortal2: Rank(23, string = "Immortal II")
    object Immortal1: Rank(22, string = "Immortal I")
    object Ascendant3: Rank(21, string = "Ascendant III")
    object Ascendant2: Rank(20, string = "Ascendant II")
    object Ascendant1: Rank(19, string = "Ascendant I")
    object Diamond3: Rank(18, string = "Diamond III")
    object Diamond2: Rank(17, string = "Diamond II")
    object Diamond1: Rank(16, string = "Diamond I")
    object Plat3: Rank(15, string = "Plat III")
    object Plat2: Rank(14, string = "Plat II")
    object Plat1: Rank(13, string = "Plat I")
    object Gold3: Rank(12, string = "Gold III")
    object Gold2: Rank(11, string = "Gold II")
    object Gold1: Rank(10, string = "Gold I")
    object Silver3: Rank(9, string = "Silver III")
    object Silver2: Rank(8, string = "Silver II")
    object Silver1: Rank(7, string = "Silver I")
    object Bronze3: Rank(6, string = "Bronze III")
    object Bronze2: Rank(5, string = "Bronze II")
    object Bronze1: Rank(4, string = "Bronze I")
    object Iron3: Rank(3, string = "Iron III")
    object Iron2: Rank(2, string = "Iron II")
    object Iron1: Rank(1, string = "Iron I")
    object Unranked: Rank(0, string = "Unranked")

    companion object {
        fun fromString(string: String): Rank {
            return when (string.firstOrNull()?.lowercase()) {
                "r" -> Radiant
                "a" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Ascendant1
                        2 -> Ascendant2
                        3 -> Ascendant3
                        else -> Ascendant1
                    }
                }
                "d" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Diamond1
                        2 -> Diamond2
                        3 -> Diamond3
                        else -> Diamond1
                    }
                }
                "p" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Plat1
                        2 -> Plat2
                        3 -> Plat3
                        else -> Plat1
                    }
                }
                "g" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Gold1
                        2 -> Gold2
                        3 -> Gold3
                        else -> Gold1
                    }
                }
                "s" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Silver1
                        2 -> Silver2
                        3 -> Silver3
                        else -> Silver1
                    }
                }
                "b" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> Bronze1
                        2 -> Bronze2
                        3 -> Bronze3
                        else -> Bronze1
                    }
                }
                "i" -> {
                    val ranks = if (string.getOrElse(1) { _ -> 'm' } == 'm'){
                        listOf(Immortal1, Immortal2, Immortal3)
                    } else {
                        listOf(Iron1, Iron2, Iron3)
                    }
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it.uppercaseChar() == 'I' }.length) {
                        1 -> ranks[0]
                        2 -> ranks[1]
                        3 -> ranks[2]
                        else ->ranks[0]
                    }
                }
                else -> Unranked
            }
        }
    }
}

sealed class GameMode(val string: String) {
    object Competitive: GameMode("Competitive")
    object Unrated: GameMode("Unrated")
    object SpikeRush: GameMode("Spike Rush")

    companion object {
        fun fromString(string: String): GameMode {
            return when (val c = string.firstOrNull()?.lowercase()) {
                "c" -> Competitive
                "u" -> Unrated
                "s" -> SpikeRush
                else -> Competitive
            }
        }
    }
}

class PostConfig(
    val minRank: Rank = Rank.Unranked,
    val needed: Int = 1,
    val gameMode: GameMode = GameMode.Competitive,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
