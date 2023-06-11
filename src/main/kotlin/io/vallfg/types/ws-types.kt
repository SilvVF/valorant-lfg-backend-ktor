package io.vallfg.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
sealed interface WsData

@Serializable
@SerialName("Message")
data class Message(
    val text: String,
): WsData







