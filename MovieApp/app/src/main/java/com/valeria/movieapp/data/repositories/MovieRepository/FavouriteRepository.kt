package com.valeria.movieapp.data.repositories.MovieRepository

import com.valeria.movieapp.data.models.Favourite
import kotlinx.coroutines.flow.Flow

interface FavouriteMovieRepository {
    suspend fun addFavourite(id: Int, title: String, posterUrl: String)
    suspend fun deleteFavourite(favourite: Favourite)
    fun isFavourite(id: Int): Flow<Boolean>
    fun getAllFavourites(): Flow<List<Favourite>>
}
