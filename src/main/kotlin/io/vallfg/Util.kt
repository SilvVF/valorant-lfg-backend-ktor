package io.vallfg

import io.vallfg.types.PlayerData
import io.vallfg.trn.player_data.TrnPlayerData
import io.vallfg.trn.player_data.toPlayerData
import kotlinx.serialization.json.Json

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
