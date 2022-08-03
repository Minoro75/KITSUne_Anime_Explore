package io.minoro75.kitsune.data.remote.dto

import io.minoro75.kitsune.domain.model.Anime

/** this entity serves as entry-point for our response **/

data class AnimeDto(
    val attributes: Attributes,
    val id: String,
    val links: Links,
    val relationships: Relationships,
    val type: String
)
fun AnimeDto.toDomainEntity() =
    Anime(
        id = id,
        titles = attributes.titles,
        createdAt = attributes.createdAt,
        endDate = attributes.endDate,
        episodeCount = attributes.episodeCount,
        averageRating = attributes.averageRating,
        status = attributes.status,
        posterImage = attributes.posterImage
    )
