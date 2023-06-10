package vallfg.io.trn

import com.google.gson.Gson
import okhttp3.*
import vallfg.io.trn.player_data1.PlayerData


val client = OkHttpClient.Builder()
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

val gson: Gson = Gson()
    .newBuilder()
    .setLenient()
    .create()
fun getPlayerData(
    name: String,
    tag: String,
): PlayerData {

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

    return gson.fromJson(jsonString, PlayerData::class.java)
}