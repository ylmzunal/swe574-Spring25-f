package com.yusuf.eurekanexus.data.model

import com.google.gson.annotations.SerializedName

data class TagDto(
    @SerializedName("label") val label: String,
    @SerializedName("description") val description: String,
    @SerializedName("wikiUrl") val wikiUrl: String,
    @SerializedName("wikipediaUrl") val wikipediaUrl: String
)