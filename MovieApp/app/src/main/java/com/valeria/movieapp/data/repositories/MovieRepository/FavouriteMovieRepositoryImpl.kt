package com.valeria.movieapp.data.repositories.MovieRepository

import com.valeria.movieapp.data.database.dao.FavouriteMovieDao
import com.valeria.movieapp.data.database.entities.toDomain
import com.valeria.movieapp.data.database.entities.toEntity
import com.valeria.movieapp.data.models.Favourite
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class FavouriteMovieRepositoryImpl (
    private val favouriteMovieDao: FavouriteMovieDao
): FavouriteMovieRepository {

    override suspend fun addFavourite(id: Int, title: String, posterUrl: String) {
        val favourite = Favourite(id, title, posterUrl)
        favouriteMovieDao.addFavourite(favourite.toEntity())
    }

    override suspend fun deleteFavourite(favourite: Favourite) {
        favouriteMovieDao.deleteFavourite(favourite.toEntity())
    }

    override fun isFavourite(id: Int): Flow<Boolean> {
        return favouriteMovieDao.isFavourite(id)
    }

    override fun getAllFavourites(): Flow<List<Favourite>> {
        return favouriteMovieDao.getAllFavourites().map { entities ->
            entities.map { it.toDomain() }
        }
    }
}
