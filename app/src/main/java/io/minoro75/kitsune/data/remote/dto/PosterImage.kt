package io.minoro75.kitsune.data.remote.dto

data class PosterImage(
    val large: String,
    val medium: String,
    val meta: MetaX,
    val original: String,
    val small: String,
    val tiny: String
)
