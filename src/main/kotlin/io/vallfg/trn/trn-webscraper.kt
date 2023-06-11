package io.vallfg.trn

import okhttp3.*
import io.vallfg.trn.player_data1.TrnPlayerData


private val client = OkHttpClient.Builder()
    .connectionSpecs(
        listOf(
            ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                .tlsVersions(TlsVersion.TLS_1_2)
                .cipherSuites(
                    CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
                    CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
                    CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256)
                .build()
        )
    )
    .build()
fun getPlayerData(
    name: String,
    tag: String,
): Result<TrnPlayerData> = runCatching {
    val playerUrl = "https://tracker.gg/valorant/profile/riot/$name%23$tag/overview"

    val playerData = runCatching {
        client.newCall(
            Request.Builder()
                .url(playerUrl)
                .build()
        )
            .execute()
    }
        .onFailure {
            it.printStackTrace()
        }
        .getOrNull()?.body?.string() ?: ""


    val start = playerData.indexOf("\"segments\"", ignoreCase = true)
    val end = playerData.indexOf("\"availableSegments\"", ignoreCase = true)

    val slicedData = playerData.slice(start until end - 1)

    val jsonString = "{${slicedData}}"

    io.vallfg.gson.fromJson(jsonString, TrnPlayerData::class.java)
}