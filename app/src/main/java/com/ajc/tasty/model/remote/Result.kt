package com.ajc.tasty.model.remote


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("approved_at")
    val approvedAt: Int?,
    @SerializedName("aspect_ratio")
    val aspectRatio: String?,
    @SerializedName("beauty_url")
    val beautyUrl: Any?,
    @SerializedName("brand")
    val brand: Brand?,
    @SerializedName("brand_id")
    val brandId: Int?,
    @SerializedName("buzz_id")
    val buzzId: Any?,
    @SerializedName("canonical_id")
    val canonicalId: String?,
    @SerializedName("compilations")
    val compilations: List<Compilation>?,
    @SerializedName("cook_time_minutes")
    val cookTimeMinutes: Any?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("created_at")
    val createdAt: Int?,
    @SerializedName("credits")
    val credits: List<Credit>?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("draft_status")
    val draftStatus: String?,
    @SerializedName("facebook_posts")
    val facebookPosts: List<Any>?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("inspired_by_url")
    val inspiredByUrl: Any?,
    @SerializedName("instructions")
    val instructions: List<Instruction>?,
    @SerializedName("is_one_top")
    val isOneTop: Boolean?,
    @SerializedName("is_shoppable")
    val isShoppable: Boolean?,
    @SerializedName("keywords")
    val keywords: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("num_servings")
    val numServings: Int?,
    @SerializedName("nutrition")
    val nutrition: Nutrition?,
    @SerializedName("nutrition_visibility")
    val nutritionVisibility: String?,
    @SerializedName("original_video_url")
    val originalVideoUrl: String?,
    @SerializedName("prep_time_minutes")
    val prepTimeMinutes: Any?,
    @SerializedName("promotion")
    val promotion: String?,
    @SerializedName("recipes")
    val recipes: List<Recipe>?,
    @SerializedName("renditions")
    val renditions: List<RenditionX>?,
    @SerializedName("sections")
    val sections: List<SectionX>?,
    @SerializedName("seo_title")
    val seoTitle: String?,
    @SerializedName("servings_noun_plural")
    val servingsNounPlural: String?,
    @SerializedName("servings_noun_singular")
    val servingsNounSingular: String?,
    @SerializedName("show")
    val show: ShowXXX?,
    @SerializedName("show_id")
    val showId: Int?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("tags")
    val tags: List<TagX>?,
    @SerializedName("thumbnail_alt_text")
    val thumbnailAltText: String?,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String?,
    @SerializedName("tips_and_ratings_enabled")
    val tipsAndRatingsEnabled: Boolean?,
    @SerializedName("topics")
    val topics: List<TopicX>?,
    @SerializedName("total_time_minutes")
    val totalTimeMinutes: Any?,
    @SerializedName("total_time_tier")
    val totalTimeTier: Any?,
    @SerializedName("updated_at")
    val updatedAt: Int?,
    @SerializedName("user_ratings")
    val userRatings: UserRatingsX?,
    @SerializedName("video_ad_content")
    val videoAdContent: String?,
    @SerializedName("video_id")
    val videoId: Int?,
    @SerializedName("video_url")
    val videoUrl: String?,
    @SerializedName("yields")
    val yields: String?
)