package com.valeria.movieapp.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.valeria.movieapp.data.database.entities.FavoriteMovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FavouriteMovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFavourite(favourite: FavoriteMovieEntity)

    @Delete
    suspend fun deleteFavourite(favourite: FavoriteMovieEntity)

    @Query("SELECT * FROM favorite_movies")
    fun getAllFavourites(): Flow<List<FavoriteMovieEntity>>

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_movies WHERE id = :id)")
    fun isFavourite(id: Int): Flow<Boolean>
}
