package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("results")
    val results: List<Result>?
)