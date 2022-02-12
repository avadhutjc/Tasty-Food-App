package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Component(
    @SerializedName("extra_comment")
    val extraComment: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("ingredient")
    val ingredient: Ingredient?,
    @SerializedName("linked_recipe")
    val linkedRecipe: LinkedRecipe?,
    @SerializedName("measurements")
    val measurements: List<Measurement>?,
    @SerializedName("position")
    val position: Int?,
    @SerializedName("raw_text")
    val rawText: String?
)