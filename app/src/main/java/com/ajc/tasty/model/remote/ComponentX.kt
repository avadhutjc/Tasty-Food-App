package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class ComponentX(
    @SerializedName("extra_comment")
    val extraComment: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("ingredient")
    val ingredient: IngredientX?,
    @SerializedName("linked_recipe")
    val linkedRecipe: LinkedRecipeX?,
    @SerializedName("measurements")
    val measurements: List<MeasurementX>?,
    @SerializedName("position")
    val position: Int?,
    @SerializedName("raw_text")
    val rawText: String?
)