package io.vallfg.lfg_server


sealed class Rank(value: Int) {
    object Radiant: Rank(25)
    object Immortal3: Rank(24)
    object Immortal2: Rank(23)
    object Immortal1: Rank(22)
    object Ascendant3: Rank(21)
    object Ascendant2: Rank(20)
    object Ascendant1: Rank(19)
    object Diamond3: Rank(18)
    object Diamond2: Rank(17)
    object Diamond1: Rank(16)
    object Plat3: Rank(15)
    object Plat2: Rank(14)
    object Plat1: Rank(13)
    object Gold3: Rank(12)
    object Gold2: Rank(11)
    object Gold1: Rank(10)
    object Silver3: Rank(9)
    object Silver2: Rank(8)
    object Silver1: Rank(7)
    object Bronze3: Rank(6)
    object Bronze2: Rank(5)
    object Bronze1: Rank(4)
    object Iron3: Rank(3)
    object Iron2: Rank(2)
    object Iron1: Rank(1)
    object Unranked: Rank(0)

    companion object {
        fun fromString(string: String): Rank {
            return when (string.firstOrNull()?.lowercase()) {
                "r" -> Radiant
                "a" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
                        1 -> Ascendant1
                        2 -> Ascendant2
                        3 -> Ascendant3
                        else -> Ascendant1
                    }
                }
                "d" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
                        1 -> Diamond1
                        2 -> Diamond2
                        3 -> Diamond3
                        else -> Diamond1
                    }
                }
                "p" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
                        1 -> Plat1
                        2 -> Plat2
                        3 -> Plat3
                        else -> Plat1
                    }
                }
                "g" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
                        1 -> Gold1
                        2 -> Gold2
                        3 -> Gold3
                        else -> Gold1
                    }
                }
                "s" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
                        1 -> Silver1
                        2 -> Silver2
                        3 -> Silver3
                        else -> Silver1
                    }
                }
                "b" -> {
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
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
                    when (val num = string.last().digitToIntOrNull() ?: string.takeLastWhile { it == 'I' }.length) {
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

sealed class GameMode(string: String) {
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

class PostConfig {


    var minRank: Rank = Rank.Unranked
        private set
    var needed: Int = 1
        private set
    var gameMode: GameMode = GameMode.Competitive
        private set

    class Builder(private val postConfig: PostConfig = PostConfig()) {

        fun setMinRank(rank: String): Builder {
            this.postConfig.minRank = Rank.fromString(rank)
            return this
        }

        fun setNeeded(need: Int): Builder {
            this.postConfig.needed = need.coerceIn(1, 4)
            return this
        }

        fun setGameMode(gameMode: String): Builder {
            this.postConfig.gameMode = GameMode.fromString(gameMode)
            return this
        }

        fun build(): PostConfig {
            return postConfig
        }
    }
}
