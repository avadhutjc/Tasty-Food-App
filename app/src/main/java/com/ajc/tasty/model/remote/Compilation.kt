package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Compilation(
    @SerializedName("approved_at")
    val approvedAt: Int?,
    @SerializedName("aspect_ratio")
    val aspectRatio: String?,
    @SerializedName("beauty_url")
    val beautyUrl: Any?,
    @SerializedName("buzz_id")
    val buzzId: Any?,
    @SerializedName("canonical_id")
    val canonicalId: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("created_at")
    val createdAt: Int?,
    @SerializedName("description")
    val description: Any?,
    @SerializedName("draft_status")
    val draftStatus: String?,
    @SerializedName("facebook_posts")
    val facebookPosts: List<Any>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_shoppable")
    val isShoppable: Boolean?,
    @SerializedName("keywords")
    val keywords: Any?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("promotion")
    val promotion: String?,
    @SerializedName("show")
    val show: List<Show>?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("thumbnail_alt_text")
    val thumbnailAltText: String?,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String?,
    @SerializedName("video_id")
    val videoId: Int?,
    @SerializedName("video_url")
    val videoUrl: String?
)