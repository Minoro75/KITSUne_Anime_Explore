package io.minoro75.kitsune.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Titles(
    val en: String,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("ja_jp")
    val jaJp: String
)
