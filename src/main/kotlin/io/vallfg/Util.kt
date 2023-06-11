package io.vallfg

import io.vallfg.types.PlayerData
import io.vallfg.trn.player_data.TrnPlayerData
import io.vallfg.trn.player_data.toPlayerData

/**
 * Util Object for getting different times in seconds.
 */
object Time {

    const val second: Long = 1L

    const val minute: Long = Time.second * 60L

    const val hour: Long = Time.minute * 60L

    const val day: Long = Time.hour * 24L
}


fun Result<TrnPlayerData>.getRankedDataOrNull(): PlayerData? {
    return this.getOrNull()
        ?.segments
        ?.first()
        ?.toPlayerData()
}
