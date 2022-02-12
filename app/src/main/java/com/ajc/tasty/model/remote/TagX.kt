package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class TagX(
    @SerializedName("display_name")
    val displayName: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?
)