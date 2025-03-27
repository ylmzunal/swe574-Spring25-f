package com.yusuf.eurekanexus.data.model

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("username") val username: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("roles") val roles: List<String>,
    @SerializedName("bio") val bio: String?,
    @SerializedName("profilePictureUrl") val profilePictureUrl: String?,
    @SerializedName("createdAt") val createdAt: String?,
    @SerializedName("commentIds") val commentIds: List<Long>?
)