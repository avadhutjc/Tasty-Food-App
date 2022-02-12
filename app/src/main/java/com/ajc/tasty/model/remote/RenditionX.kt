package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class RenditionX(
    @SerializedName("aspect")
    val aspect: String?,
    @SerializedName("bit_rate")
    val bitRate: Int?,
    @SerializedName("container")
    val container: String?,
    @SerializedName("content_type")
    val contentType: String?,
    @SerializedName("duration")
    val duration: Int?,
    @SerializedName("file_size")
    val fileSize: Int?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("maximum_bit_rate")
    val maximumBitRate: Any?,
    @SerializedName("minimum_bit_rate")
    val minimumBitRate: Any?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("poster_url")
    val posterUrl: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
)