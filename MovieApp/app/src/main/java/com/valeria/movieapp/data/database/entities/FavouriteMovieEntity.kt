package com.valeria.movieapp.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.valeria.movieapp.data.models.Favourite

@Entity(tableName = "favorite_movies")
data class FavoriteMovieEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val posterUrl: String
)

//para la app
fun FavoriteMovieEntity.toDomain() = Favourite(
    id = id,
    title = title,
    posterUrl = posterUrl
)

//para room
fun Favourite.toEntity() = FavoriteMovieEntity(
    id = id,
    title = title,
    posterUrl = posterUrl
)
