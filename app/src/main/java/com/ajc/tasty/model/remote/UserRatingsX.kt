package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class UserRatingsX(
    @SerializedName("count_negative")
    val countNegative: Int?,
    @SerializedName("count_positive")
    val countPositive: Int?,
    @SerializedName("score")
    val score: Any?
)