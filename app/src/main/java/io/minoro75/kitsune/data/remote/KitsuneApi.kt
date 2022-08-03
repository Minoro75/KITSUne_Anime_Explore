package io.minoro75.kitsune.data.remote

import io.minoro75.kitsune.data.remote.dto.AnimeDto
import retrofit2.http.GET
import retrofit2.http.Path

interface KitsuneApi {
    @GET("/trending/anime")
    suspend fun getTrending() : List<AnimeDto>

    @GET("anime/{animeId}")
    suspend fun getAnime(@Path("animeId") animeId: String) : AnimeDto
}
