package vallfg.io.trn.player_data1

import com.example.example.Attributes
import com.google.gson.annotations.SerializedName


data class Segments (

  @SerializedName("type"       ) val type       : String?     = null,
  @SerializedName("attributes" ) val attributes : Attributes? = Attributes(),
  @SerializedName("metadata"   ) val metadata   : Metadata?   = Metadata(),
  @SerializedName("expiryDate" ) val expiryDate : String?     = null,
  @SerializedName("stats"      ) val stats      : Stats?      = Stats()

)