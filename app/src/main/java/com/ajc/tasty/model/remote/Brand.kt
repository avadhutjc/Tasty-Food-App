package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Brand(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image_url")
    val imageUrl: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?
)