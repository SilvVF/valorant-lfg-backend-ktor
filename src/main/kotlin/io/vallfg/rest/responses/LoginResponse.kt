package io.vallfg.rest.responses

import io.vallfg.types.PlayerData

data class LoginResponse(
    val statusCode: Int,
    val ok: Boolean,
    val player: PlayerData
)