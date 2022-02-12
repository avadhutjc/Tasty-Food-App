package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class LinkedRecipe(
    @SerializedName("approved_at")
    val approvedAt: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String?
)