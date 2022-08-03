package io.minoro75.kitsune.data.repository

import io.minoro75.kitsune.data.remote.RemoteDataSource
import io.minoro75.kitsune.data.remote.dto.AnimeDto
import io.minoro75.kitsune.domain.repository.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : AnimeRepository {

    override suspend fun getTrendingAnime(): List<AnimeDto> =
        remoteDataSource.getTrendingAnime()


    override suspend fun getAnimeDetails(animeId: String): AnimeDto =
        remoteDataSource.getAnime(animeId)
}
