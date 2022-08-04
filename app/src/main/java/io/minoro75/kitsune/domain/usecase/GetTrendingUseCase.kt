package io.minoro75.kitsune.domain.usecase

import io.minoro75.kitsune.common.Resource
import io.minoro75.kitsune.data.remote.dto.toDomainEntity
import io.minoro75.kitsune.domain.model.Anime
import io.minoro75.kitsune.domain.repository.AnimeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetTrendingUseCase @Inject constructor(
    private val repository: AnimeRepository
) {
    operator fun invoke(): Flow<Resource<List<Anime>>> =
        flow {
            try {
                emit(Resource.Loading())
                val list = repository.getTrendingAnime().map { it.toDomainEntity() }
                emit(Resource.Success(list))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "unexpected error"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Please check your internet connection"))
            }
        }
}
