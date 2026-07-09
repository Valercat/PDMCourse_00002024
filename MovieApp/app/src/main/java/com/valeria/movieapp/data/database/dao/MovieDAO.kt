package com.valeria.movieapp.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.valeria.movieapp.data.database.entities.MovieEntity

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie")
    suspend fun getMovies(): List<MovieEntity>

    @Query("SELECT * FROM movie WHERE id = :id")
    suspend fun getMovieById(id: Int): MovieEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieEntity>)
}
