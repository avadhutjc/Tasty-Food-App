package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("components")
    val components: List<Component>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("position")
    val position: Int?
)