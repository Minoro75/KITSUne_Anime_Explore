package io.minoro75.kitsune.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: KitsuneApi
) {

    suspend fun getTrendingAnime() =
        api.getTrending()

    suspend fun getAnime(id: String) =
        api.getAnime(id)
}

