package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class SectionX(
    @SerializedName("components")
    val components: List<ComponentX>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("position")
    val position: Int?
)