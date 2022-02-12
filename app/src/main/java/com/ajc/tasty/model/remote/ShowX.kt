package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class ShowX(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)