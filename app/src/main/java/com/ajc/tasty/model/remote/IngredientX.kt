package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class IngredientX(
    @SerializedName("created_at")
    val createdAt: Int?,
    @SerializedName("display_plural")
    val displayPlural: String?,
    @SerializedName("display_singular")
    val displaySingular: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("updated_at")
    val updatedAt: Int?
)