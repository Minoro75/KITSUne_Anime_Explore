package io.minoro75.kitsune.domain.model

import io.minoro75.kitsune.data.remote.dto.PosterImage
import io.minoro75.kitsune.data.remote.dto.Titles

data class Anime(
    val id: String,
    val titles: Titles,
    val createdAt: String,
    val endDate: String,
    val episodeCount: Int,
    val averageRating: String,
    val status: String,
    val posterImage: PosterImage
)

