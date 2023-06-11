package io.vallfg.trn.player_data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable data class Ability1Casts (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null
)

@Serializable data class Ability1CastsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Ability1CastsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Ability2Casts (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Ability2CastsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Ability2CastsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Aces (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Assists (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AssistsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AssistsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackAssists (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackAssistsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackDamage (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackDamagePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class AttackFirstBloods (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackFirstBloodsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackFirstDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class AttackFirstDeathsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackHeadshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackKAST (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackKDRatio (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackKills (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackKillsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackRoundsLost (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackRoundsPlayed (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackRoundsWinPct (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class AttackRoundsWon (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackScore (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackScorePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackSurvived (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class AttackTraded (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class Attributes (

    @SerialName("seasonId" ) var seasonId : String? = null,
    @SerialName("playlist" ) var playlist : String? = null

)

@Serializable data class Clutches (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Clutches1v1 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Clutches1v2 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Clutches1v3 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Clutches1v4 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Clutches1v5 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesLost (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class ClutchesLost1v1 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesLost1v2 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesLost1v3 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesLost1v4 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesLost1v5 (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ClutchesPercentage (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Damage (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamageDelta (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Int?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamageDeltaPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamagePerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamagePerMinute (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamagePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Int?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DamageReceived (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DealtBodyshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DealtHeadshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DealtLegshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Deaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DeathsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class DeathsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseAssists (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseAssistsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class DefenseDamage (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseDamagePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseFirstBloods (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseFirstBloodsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseFirstDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseFirstDeathsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseHeadshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class DefenseKAST (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseKDRatio (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseKills (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseKillsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseRoundsLost (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class DefenseRoundsPlayed (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseRoundsWinPct (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseRoundsWon (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class DefenseScore (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseScorePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseSurvived (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefenseTraded (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Defuses (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefusesPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class DefusesPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class EconRating (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class EconRatingPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class EconRatingPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class FirstBloods (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class FirstBloodsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class FirstBloodsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class FirstDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class FirstDeathsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Flawless (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class GrenadeCasts (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class GrenadeCastsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class GrenadeCastsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Headshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class HeadshotsPercentage (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class HeadshotsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class KADRatio (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class KAST (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class KDARatio (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class KDRatio (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class Kills (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Kills1K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class Kills2K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class Kills3K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Kills4K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Kills5K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Kills6K (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class KillsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class KillsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Rank (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : String?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class LastDeaths (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class MatchesDuration (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class MatchesLost (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class MatchesPlayed (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class MatchesTied (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class MatchesWinPct (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class MatchesWon (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Int?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Metadata (

    @SerialName("iconUrl"  ) var iconUrl  : String? = null,
    @SerialName("tierName" ) var tierName : String? = null,
    @SerialName("actId"    ) var actId    : String? = null,
    @SerialName("actName"  ) var actName  : String? = null

)
@Serializable data class MostKillsInMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class PeakRank (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : String?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class Plants (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class PlantsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class PlantsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class ReceivedBodyshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class ReceivedHeadshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ReceivedLegshots (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class RoundsDuration (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class RoundsLost (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class RoundsPlayed (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class RoundsWinPct (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class RoundsWon (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Score (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class ScorePerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class ScorePerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : Double?      = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Segments (

    @SerialName("type"       ) val type       : String?     = null,
    @SerialName("attributes" ) val attributes : Attributes? = Attributes(),
    @SerialName("metadata"   ) val metadata   : Metadata?   = Metadata(),
    @SerialName("expiryDate" ) val expiryDate : String?     = null,
    @SerialName("stats"      ) val stats      : Stats?      = Stats()

)

@Serializable data class Stats (

    @SerialName("matchesPlayed"              ) var matchesPlayed              : MatchesPlayed?              = MatchesPlayed(),
    @SerialName("matchesWon"                 ) var matchesWon                 : MatchesWon?                 = MatchesWon(),
    @SerialName("matchesLost"                ) var matchesLost                : MatchesLost?                = MatchesLost(),
    @SerialName("matchesTied"                ) var matchesTied                : MatchesTied?                = MatchesTied(),
    @SerialName("matchesWinPct"              ) var matchesWinPct              : MatchesWinPct?              = MatchesWinPct(),
    @SerialName("matchesDuration"            ) var matchesDuration            : MatchesDuration?            = MatchesDuration(),
    @SerialName("timePlayed"                 ) var timePlayed                 : TimePlayed?                 = TimePlayed(),
    @SerialName("roundsPlayed"               ) var roundsPlayed               : RoundsPlayed?               = RoundsPlayed(),
    @SerialName("roundsWon"                  ) var roundsWon                  : RoundsWon?                  = RoundsWon(),
    @SerialName("roundsLost"                 ) var roundsLost                 : RoundsLost?                 = RoundsLost(),
    @SerialName("roundsWinPct"               ) var roundsWinPct               : RoundsWinPct?               = RoundsWinPct(),
    @SerialName("roundsDuration"             ) var roundsDuration             : RoundsDuration?             = RoundsDuration(),
    @SerialName("score"                      ) var score                      : Score?                      = Score(),
    @SerialName("scorePerMatch"              ) var scorePerMatch              : ScorePerMatch?              = ScorePerMatch(),
    @SerialName("scorePerRound"              ) var scorePerRound              : ScorePerRound?              = ScorePerRound(),
    @SerialName("kills"                      ) var kills                      : Kills?                      = Kills(),
    @SerialName("killsPerRound"              ) var killsPerRound              : KillsPerRound?              = KillsPerRound(),
    @SerialName("killsPerMatch"              ) var killsPerMatch              : KillsPerMatch?              = KillsPerMatch(),
    @SerialName("deaths"                     ) var deaths                     : Deaths?                     = Deaths(),
    @SerialName("deathsPerRound"             ) var deathsPerRound             : DeathsPerRound?             = DeathsPerRound(),
    @SerialName("deathsPerMatch"             ) var deathsPerMatch             : DeathsPerMatch?             = DeathsPerMatch(),
    @SerialName("assists"                    ) var assists                    : Assists?                    = Assists(),
    @SerialName("assistsPerRound"            ) var assistsPerRound            : AssistsPerRound?            = AssistsPerRound(),
    @SerialName("assistsPerMatch"            ) var assistsPerMatch            : AssistsPerMatch?            = AssistsPerMatch(),
    @SerialName("kDRatio"                    ) var kDRatio                    : KDRatio?                    = KDRatio(),
    @SerialName("kDARatio"                   ) var kDARatio                   : KDARatio?                   = KDARatio(),
    @SerialName("kADRatio"                   ) var kADRatio                   : KADRatio?                   = KADRatio(),
    @SerialName("damage"                     ) var damage                     : Damage?                     = Damage(),
    @SerialName("damageDelta"                ) var damageDelta                : DamageDelta?                = DamageDelta(),
    @SerialName("damageDeltaPerRound"        ) var damageDeltaPerRound        : DamageDeltaPerRound?        = DamageDeltaPerRound(),
    @SerialName("damagePerRound"             ) var damagePerRound             : DamagePerRound?             = DamagePerRound(),
    @SerialName("damagePerMatch"             ) var damagePerMatch             : DamagePerMatch?             = DamagePerMatch(),
    @SerialName("damagePerMinute"            ) var damagePerMinute            : DamagePerMinute?            = DamagePerMinute(),
    @SerialName("damageReceived"             ) var damageReceived             : DamageReceived?             = DamageReceived(),
    @SerialName("headshots"                  ) var headshots                  : Headshots?                  = Headshots(),
    @SerialName("headshotsPerRound"          ) var headshotsPerRound          : HeadshotsPerRound?          = HeadshotsPerRound(),
    @SerialName("headshotsPercentage"        ) var headshotsPercentage        : HeadshotsPercentage?        = HeadshotsPercentage(),
    @SerialName("grenadeCasts"               ) var grenadeCasts               : GrenadeCasts?               = GrenadeCasts(),
    @SerialName("grenadeCastsPerRound"       ) var grenadeCastsPerRound       : GrenadeCastsPerRound?       = GrenadeCastsPerRound(),
    @SerialName("grenadeCastsPerMatch"       ) var grenadeCastsPerMatch       : GrenadeCastsPerMatch?       = GrenadeCastsPerMatch(),
    @SerialName("ability1Casts"              ) var ability1Casts              : Ability1Casts?              = Ability1Casts(),
    @SerialName("ability1CastsPerRound"      ) var ability1CastsPerRound      : Ability1CastsPerRound?      = Ability1CastsPerRound(),
    @SerialName("ability1CastsPerMatch"      ) var ability1CastsPerMatch      : Ability1CastsPerMatch?      = Ability1CastsPerMatch(),
    @SerialName("ability2Casts"              ) var ability2Casts              : Ability2Casts?              = Ability2Casts(),
    @SerialName("ability2CastsPerRound"      ) var ability2CastsPerRound      : Ability2CastsPerRound?      = Ability2CastsPerRound(),
    @SerialName("ability2CastsPerMatch"      ) var ability2CastsPerMatch      : Ability2CastsPerMatch?      = Ability2CastsPerMatch(),
    @SerialName("ultimateCasts"              ) var ultimateCasts              : UltimateCasts?              = UltimateCasts(),
    @SerialName("ultimateCastsPerRound"      ) var ultimateCastsPerRound      : UltimateCastsPerRound?      = UltimateCastsPerRound(),
    @SerialName("ultimateCastsPerMatch"      ) var ultimateCastsPerMatch      : UltimateCastsPerMatch?      = UltimateCastsPerMatch(),
    @SerialName("dealtHeadshots"             ) var dealtHeadshots             : DealtHeadshots?             = DealtHeadshots(),
    @SerialName("dealtBodyshots"             ) var dealtBodyshots             : DealtBodyshots?             = DealtBodyshots(),
    @SerialName("dealtLegshots"              ) var dealtLegshots              : DealtLegshots?              = DealtLegshots(),
    @SerialName("receivedHeadshots"          ) var receivedHeadshots          : ReceivedHeadshots?          = ReceivedHeadshots(),
    @SerialName("receivedBodyshots"          ) var receivedBodyshots          : ReceivedBodyshots?          = ReceivedBodyshots(),
    @SerialName("receivedLegshots"           ) var receivedLegshots           : ReceivedLegshots?           = ReceivedLegshots(),
    @SerialName("econRating"                 ) var econRating                 : EconRating?                 = EconRating(),
    @SerialName("econRatingPerMatch"         ) var econRatingPerMatch         : EconRatingPerMatch?         = EconRatingPerMatch(),
    @SerialName("econRatingPerRound"         ) var econRatingPerRound         : EconRatingPerRound?         = EconRatingPerRound(),
    @SerialName("suicides"                   ) var suicides                   : Suicides?                   = Suicides(),
    @SerialName("firstBloods"                ) var firstBloods                : FirstBloods?                = FirstBloods(),
    @SerialName("firstBloodsPerRound"        ) var firstBloodsPerRound        : FirstBloodsPerRound?        = FirstBloodsPerRound(),
    @SerialName("firstBloodsPerMatch"        ) var firstBloodsPerMatch        : FirstBloodsPerMatch?        = FirstBloodsPerMatch(),
    @SerialName("firstDeaths"                ) var firstDeaths                : FirstDeaths?                = FirstDeaths(),
    @SerialName("firstDeathsPerRound"        ) var firstDeathsPerRound        : FirstDeathsPerRound?        = FirstDeathsPerRound(),
    @SerialName("lastDeaths"                 ) var lastDeaths                 : LastDeaths?                 = LastDeaths(),
    @SerialName("survived"                   ) var survived                   : Survived?                   = Survived(),
    @SerialName("traded"                     ) var traded                     : Traded?                     = Traded(),
    @SerialName("kAST"                       ) var kAST                       : KAST?                       = KAST(),
    @SerialName("mostKillsInMatch"           ) var mostKillsInMatch           : MostKillsInMatch?           = MostKillsInMatch(),
    @SerialName("flawless"                   ) var flawless                   : Flawless?                   = Flawless(),
    @SerialName("thrifty"                    ) var thrifty                    : Thrifty?                    = Thrifty(),
    @SerialName("aces"                       ) var aces                       : Aces?                       = Aces(),
    @SerialName("teamAces"                   ) var teamAces                   : TeamAces?                   = TeamAces(),
    @SerialName("clutches"                   ) var clutches                   : Clutches?                   = Clutches(),
    @SerialName("clutchesPercentage"         ) var clutchesPercentage         : ClutchesPercentage?         = ClutchesPercentage(),
    @SerialName("clutchesLost"               ) var clutchesLost               : ClutchesLost?               = ClutchesLost(),
    @SerialName("clutches1v1"                ) var clutches1v1                : Clutches1v1?                = Clutches1v1(),
    @SerialName("clutches1v2"                ) var clutches1v2                : Clutches1v2?                = Clutches1v2(),
    @SerialName("clutches1v3"                ) var clutches1v3                : Clutches1v3?                = Clutches1v3(),
    @SerialName("clutches1v4"                ) var clutches1v4                : Clutches1v4?                = Clutches1v4(),
    @SerialName("clutches1v5"                ) var clutches1v5                : Clutches1v5?                = Clutches1v5(),
    @SerialName("clutchesLost1v1"            ) var clutchesLost1v1            : ClutchesLost1v1?            = ClutchesLost1v1(),
    @SerialName("clutchesLost1v2"            ) var clutchesLost1v2            : ClutchesLost1v2?            = ClutchesLost1v2(),
    @SerialName("clutchesLost1v3"            ) var clutchesLost1v3            : ClutchesLost1v3?            = ClutchesLost1v3(),
    @SerialName("clutchesLost1v4"            ) var clutchesLost1v4            : ClutchesLost1v4?            = ClutchesLost1v4(),
    @SerialName("clutchesLost1v5"            ) var clutchesLost1v5            : ClutchesLost1v5?            = ClutchesLost1v5(),
    @SerialName("kills1K"                    ) var kills1K                    : Kills1K?                    = Kills1K(),
    @SerialName("kills2K"                    ) var kills2K                    : Kills2K?                    = Kills2K(),
    @SerialName("kills3K"                    ) var kills3K                    : Kills3K?                    = Kills3K(),
    @SerialName("kills4K"                    ) var kills4K                    : Kills4K?                    = Kills4K(),
    @SerialName("kills5K"                    ) var kills5K                    : Kills5K?                    = Kills5K(),
    @SerialName("kills6K"                    ) var kills6K                    : Kills6K?                    = Kills6K(),
    @SerialName("plants"                     ) var plants                     : Plants?                     = Plants(),
    @SerialName("plantsPerMatch"             ) var plantsPerMatch             : PlantsPerMatch?             = PlantsPerMatch(),
    @SerialName("plantsPerRound"             ) var plantsPerRound             : PlantsPerRound?             = PlantsPerRound(),
    @SerialName("attackKills"                ) var attackKills                : AttackKills?                = AttackKills(),
    @SerialName("attackKillsPerRound"        ) var attackKillsPerRound        : AttackKillsPerRound?        = AttackKillsPerRound(),
    @SerialName("attackDeaths"               ) var attackDeaths               : AttackDeaths?               = AttackDeaths(),
    @SerialName("attackKDRatio"              ) var attackKDRatio              : AttackKDRatio?              = AttackKDRatio(),
    @SerialName("attackAssists"              ) var attackAssists              : AttackAssists?              = AttackAssists(),
    @SerialName("attackAssistsPerRound"      ) var attackAssistsPerRound      : AttackAssistsPerRound?      = AttackAssistsPerRound(),
    @SerialName("attackRoundsWon"            ) var attackRoundsWon            : AttackRoundsWon?            = AttackRoundsWon(),
    @SerialName("attackRoundsLost"           ) var attackRoundsLost           : AttackRoundsLost?           = AttackRoundsLost(),
    @SerialName("attackRoundsPlayed"         ) var attackRoundsPlayed         : AttackRoundsPlayed?         = AttackRoundsPlayed(),
    @SerialName("attackRoundsWinPct"         ) var attackRoundsWinPct         : AttackRoundsWinPct?         = AttackRoundsWinPct(),
    @SerialName("attackScore"                ) var attackScore                : AttackScore?                = AttackScore(),
    @SerialName("attackScorePerRound"        ) var attackScorePerRound        : AttackScorePerRound?        = AttackScorePerRound(),
    @SerialName("attackDamage"               ) var attackDamage               : AttackDamage?               = AttackDamage(),
    @SerialName("attackDamagePerRound"       ) var attackDamagePerRound       : AttackDamagePerRound?       = AttackDamagePerRound(),
    @SerialName("attackHeadshots"            ) var attackHeadshots            : AttackHeadshots?            = AttackHeadshots(),
    @SerialName("attackTraded"               ) var attackTraded               : AttackTraded?               = AttackTraded(),
    @SerialName("attackSurvived"             ) var attackSurvived             : AttackSurvived?             = AttackSurvived(),
    @SerialName("attackFirstBloods"          ) var attackFirstBloods          : AttackFirstBloods?          = AttackFirstBloods(),
    @SerialName("attackFirstBloodsPerRound"  ) var attackFirstBloodsPerRound  : AttackFirstBloodsPerRound?  = AttackFirstBloodsPerRound(),
    @SerialName("attackFirstDeaths"          ) var attackFirstDeaths          : AttackFirstDeaths?          = AttackFirstDeaths(),
    @SerialName("attackFirstDeathsPerRound"  ) var attackFirstDeathsPerRound  : AttackFirstDeathsPerRound?  = AttackFirstDeathsPerRound(),
    @SerialName("attackKAST"                 ) var attackKAST                 : AttackKAST?                 = AttackKAST(),
    @SerialName("defuses"                    ) var defuses                    : Defuses?                    = Defuses(),
    @SerialName("defusesPerMatch"            ) var defusesPerMatch            : DefusesPerMatch?            = DefusesPerMatch(),
    @SerialName("defusesPerRound"            ) var defusesPerRound            : DefusesPerRound?            = DefusesPerRound(),
    @SerialName("defenseKills"               ) var defenseKills               : DefenseKills?               = DefenseKills(),
    @SerialName("defenseKillsPerRound"       ) var defenseKillsPerRound       : DefenseKillsPerRound?       = DefenseKillsPerRound(),
    @SerialName("defenseDeaths"              ) var defenseDeaths              : DefenseDeaths?              = DefenseDeaths(),
    @SerialName("defenseKDRatio"             ) var defenseKDRatio             : DefenseKDRatio?             = DefenseKDRatio(),
    @SerialName("defenseAssists"             ) var defenseAssists             : DefenseAssists?             = DefenseAssists(),
    @SerialName("defenseAssistsPerRound"     ) var defenseAssistsPerRound     : DefenseAssistsPerRound?     = DefenseAssistsPerRound(),
    @SerialName("defenseRoundsWon"           ) var defenseRoundsWon           : DefenseRoundsWon?           = DefenseRoundsWon(),
    @SerialName("defenseRoundsLost"          ) var defenseRoundsLost          : DefenseRoundsLost?          = DefenseRoundsLost(),
    @SerialName("defenseRoundsPlayed"        ) var defenseRoundsPlayed        : DefenseRoundsPlayed?        = DefenseRoundsPlayed(),
    @SerialName("defenseRoundsWinPct"        ) var defenseRoundsWinPct        : DefenseRoundsWinPct?        = DefenseRoundsWinPct(),
    @SerialName("defenseScore"               ) var defenseScore               : DefenseScore?               = DefenseScore(),
    @SerialName("defenseScorePerRound"       ) var defenseScorePerRound       : DefenseScorePerRound?       = DefenseScorePerRound(),
    @SerialName("defenseDamage"              ) var defenseDamage              : DefenseDamage?              = DefenseDamage(),
    @SerialName("defenseDamagePerRound"      ) var defenseDamagePerRound      : DefenseDamagePerRound?      = DefenseDamagePerRound(),
    @SerialName("defenseHeadshots"           ) var defenseHeadshots           : DefenseHeadshots?           = DefenseHeadshots(),
    @SerialName("defenseTraded"              ) var defenseTraded              : DefenseTraded?              = DefenseTraded(),
    @SerialName("defenseSurvived"            ) var defenseSurvived            : DefenseSurvived?            = DefenseSurvived(),
    @SerialName("defenseFirstBloods"         ) var defenseFirstBloods         : DefenseFirstBloods?         = DefenseFirstBloods(),
    @SerialName("defenseFirstBloodsPerRound" ) var defenseFirstBloodsPerRound : DefenseFirstBloodsPerRound? = DefenseFirstBloodsPerRound(),
    @SerialName("defenseFirstDeaths"         ) var defenseFirstDeaths         : DefenseFirstDeaths?         = DefenseFirstDeaths(),
    @SerialName("defenseFirstDeathsPerRound" ) var defenseFirstDeathsPerRound : DefenseFirstDeathsPerRound? = DefenseFirstDeathsPerRound(),
    @SerialName("defenseKAST"                ) var defenseKAST                : DefenseKAST?                = DefenseKAST(),
    @SerialName("rank"                       ) var rank                       : Rank?                       = Rank(),
    @SerialName("trnPerformanceScore"        ) var trnPerformanceScore        : TrnPerformanceScore?        = TrnPerformanceScore(),
    @SerialName("peakRank"                   ) var peakRank                   : PeakRank?                   = PeakRank()

)

@Serializable data class Suicides (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Survived (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class TeamAces (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Thrifty (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class TimePlayed (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class Traded (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class TrnPerformanceScore (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)

@Serializable data class UltimateCasts (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Int?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)


@Serializable data class UltimateCastsPerMatch (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?      = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)
@Serializable data class UltimateCastsPerRound (

    @SerialName("rank"            ) var rank            : String?   = null,
    @SerialName("percentile"      ) var percentile      : String?   = null,
    @SerialName("displayName"     ) var displayName     : String?   = null,
    @SerialName("displayCategory" ) var displayCategory : String?   = null,
    @SerialName("category"        ) var category        : String?   = null,
    @SerialName("description"     ) var description     : String?   = null,
    @SerialName("metadata"        ) var metadata        : Metadata? = Metadata(),
    @SerialName("value"           ) var value           : Double?   = null,
    @SerialName("displayValue"    ) var displayValue    : String?   = null,
    @SerialName("displayType"     ) var displayType     : String?   = null

)