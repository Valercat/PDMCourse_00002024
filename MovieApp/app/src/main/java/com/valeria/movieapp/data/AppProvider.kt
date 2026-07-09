package com.valeria.movieapp.data

import android.content.Context
import com.valeria.movieapp.data.database.AppDatabase
import com.valeria.movieapp.data.repositories.MovieRepository.FavouriteMovieRepository
import com.valeria.movieapp.data.repositories.MovieRepository.FavouriteMovieRepositoryImpl
import com.valeria.movieapp.data.repositories.MovieRepository.MovieApiRepository
import com.valeria.movieapp.data.repositories.MovieRepository.MovieRepository

class AppProvider(context : Context) {
    private val appDatabase = AppDatabase.getDatabase(context)

    fun provideMovieRepository(): MovieRepository {
        return MovieApiRepository(
            // movieDao = appDatabase.movieDao()
        )
    }
    fun provideFavouriteMovieRepository(): FavouriteMovieRepository {
        return FavouriteMovieRepositoryImpl(
            favouriteMovieDao = appDatabase.favouriteMovieDao()
        )
    }
}
