package io.minoro75.kitsune.domain.repository

import io.minoro75.kitsune.data.remote.dto.AnimeDto

/** Interface may be not necessary for that application size,
 * but i want to add it here for easy repo-mocking in tests **/

interface AnimeRepository {
    suspend fun getTrendingAnime(): List<AnimeDto>

    suspend fun getAnimeDetails(animeId: String): AnimeDto
}
