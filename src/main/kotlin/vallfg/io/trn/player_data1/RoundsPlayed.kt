package com.example.example

import com.google.gson.annotations.SerializedName
import vallfg.io.trn.player_data1.Metadata


data class RoundsPlayed (

    @SerializedName("rank"            ) var rank            : String?   = null,
    @SerializedName("percentile"      ) var percentile      : String?   = null,
    @SerializedName("displayName"     ) var displayName     : String?   = null,
    @SerializedName("displayCategory" ) var displayCategory : String?   = null,
    @SerializedName("category"        ) var category        : String?   = null,
    @SerializedName("description"     ) var description     : String?   = null,
    @SerializedName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerializedName("value"           ) var value           : Int?      = null,
    @SerializedName("displayValue"    ) var displayValue    : String?   = null,
    @SerializedName("displayType"     ) var displayType     : String?   = null

)