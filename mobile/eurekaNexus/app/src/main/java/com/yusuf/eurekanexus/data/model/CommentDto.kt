package com.yusuf.eurekanexus.data.model

import com.google.gson.annotations.SerializedName

data class CommentDto(
    @SerializedName("text") val text: String,
    @SerializedName("votes") val votes: Int,
    @SerializedName("userId") val userId: Long,
    @SerializedName("username") val username: String,
    @SerializedName("postId") val postId: Long,
    @SerializedName("parentCommentId") val parentCommentId: Long?
)