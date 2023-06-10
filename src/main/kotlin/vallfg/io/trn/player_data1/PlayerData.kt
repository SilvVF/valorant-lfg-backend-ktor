package vallfg.io.trn.player_data1

import com.example.example.Segments
import com.google.gson.annotations.SerializedName


data class PlayerData (

  @SerializedName("segments" ) var segments : ArrayList<Segments> = arrayListOf()

)