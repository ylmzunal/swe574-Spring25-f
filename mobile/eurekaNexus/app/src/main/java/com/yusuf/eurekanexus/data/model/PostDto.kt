package com.yusuf.eurekanexus.data.model

import com.google.gson.annotations.SerializedName

data class PostDto(
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("votes") val votes: Int,
    @SerializedName("userId") val userId: Long,
    @SerializedName("tags") val tags: List<String>,
    @SerializedName("material") val material: String?,
    @SerializedName("size") val size: String?,
    @SerializedName("textAndLanguage") val textAndLanguage: String?,
    @SerializedName("color") val color: String?,
    @SerializedName("shape") val shape: String?,
    @SerializedName("weight") val weight: String?,
    @SerializedName("price") val price: String?,
    @SerializedName("location") val location: String?,
    @SerializedName("timePeriod") val timePeriod: String?,
    @SerializedName("smell") val smell: String?,
    @SerializedName("taste") val taste: String?,
    @SerializedName("texture") val texture: String?,
    @SerializedName("hardness") val hardness: String?,
    @SerializedName("pattern") val pattern: String?,
    @SerializedName("brand") val brand: String?,
    @SerializedName("print") val print: String?,
    @SerializedName("handmade") val handmade: Boolean?,
    @SerializedName("functionality") val functionality: String?,
    @SerializedName("widthValue") val widthValue: String?,
    @SerializedName("widthUnit") val widthUnit: String?,
    @SerializedName("heightValue") val heightValue: String?,
    @SerializedName("heightUnit") val heightUnit: String?,
    @SerializedName("depthValue") val depthValue: String?,
    @SerializedName("depthUnit") val depthUnit: String?,
    @SerializedName("comments") val comments: List<CommentDto>?,
    @SerializedName("solutionCommentId") val solutionCommentId: Long?,
    @SerializedName("createdAt") val createdAt: String?
)