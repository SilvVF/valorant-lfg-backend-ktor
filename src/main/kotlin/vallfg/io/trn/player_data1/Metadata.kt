package vallfg.io.trn.player_data1

import com.google.gson.annotations.SerializedName


data class Metadata (

  @SerializedName("iconUrl"  ) var iconUrl  : String? = null,
  @SerializedName("tierName" ) var tierName : String? = null,
  @SerializedName("actId"    ) var actId    : String? = null,
  @SerializedName("actName"  ) var actName  : String? = null

)