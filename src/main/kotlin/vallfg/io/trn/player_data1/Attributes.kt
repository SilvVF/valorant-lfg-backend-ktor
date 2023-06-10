package com.example.example

import com.google.gson.annotations.SerializedName


data class Attributes (

  @SerializedName("seasonId" ) var seasonId : String? = null,
  @SerializedName("playlist" ) var playlist : String? = null

)