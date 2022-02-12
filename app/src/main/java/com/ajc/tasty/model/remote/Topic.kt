package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Topic(
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?
)