package com.example.example

import com.google.gson.annotations.SerializedName
import vallfg.io.trn.player_data1.Metadata
import vallfg.io.trn.player_data1.Stats


data class Segments (

  @SerializedName("type"       ) var type       : String?     = null,
  @SerializedName("attributes" ) var attributes : Attributes? = Attributes(),
  @SerializedName("metadata"   ) var metadata   : Metadata?   = Metadata(),
  @SerializedName("expiryDate" ) var expiryDate : String?     = null,
  @SerializedName("stats"      ) var stats      : Stats?      = Stats()

)