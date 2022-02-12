package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class CreditX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?
)