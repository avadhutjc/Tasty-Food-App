package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Unit(
    @SerializedName("abbreviation")
    val abbreviation: String?,
    @SerializedName("display_plural")
    val displayPlural: String?,
    @SerializedName("display_singular")
    val displaySingular: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("system")
    val system: String?
)