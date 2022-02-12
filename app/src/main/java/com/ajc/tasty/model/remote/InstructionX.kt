package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class InstructionX(
    @SerializedName("appliance")
    val appliance: String?,
    @SerializedName("display_text")
    val displayText: String?,
    @SerializedName("end_time")
    val endTime: Int?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("position")
    val position: Int?,
    @SerializedName("start_time")
    val startTime: Int?,
    @SerializedName("temperature")
    val temperature: Int?
)