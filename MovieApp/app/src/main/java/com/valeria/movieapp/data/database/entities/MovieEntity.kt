package com.valeria.movieapp.data.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.valeria.movieapp.data.models.Favourite
import com.valeria.movieapp.model.Movie

@Entity(tableName = "movie")
data class MovieEntity(
    @PrimaryKey val id: Int,
    val title: String,
    val originalTitle: String,
    val originalLanguage: String,
    val overview: String,
    val releaseDate: String,
    val adult: Boolean,
    val genreIds: List<Int>,
    val popularity: Double,
    val voteAverage: Double,
    val voteCount: Int,
    val video: Boolean,
    val backdropUrl: String,
    val posterUrl: String
)

//para la app
fun MovieEntity.toModel(): Movie {
    return Movie(
        id = id,
        title = title,
        originalTitle = originalTitle,
        originalLanguage = originalLanguage,
        overview = overview,
        releaseDate = releaseDate,
        adult = adult,
        genreIds = genreIds,
        popularity = popularity,
        voteAverage = voteAverage,
        voteCount = voteCount,
        video = video,
        backdropUrl = backdropUrl,
        posterUrl = posterUrl
    )
}

//para room
//es un detalle de cómo se guarda
fun Movie.toEntity() = MovieEntity(
    id = id,
    title = title,
    originalTitle = originalTitle,
    originalLanguage = originalLanguage,
    overview = overview,
    releaseDate = releaseDate,
    adult = adult,
    genreIds = genreIds,
    popularity = popularity,
    voteAverage = voteAverage,
    voteCount = voteCount,
    video = video,
    backdropUrl = backdropUrl,
    posterUrl = posterUrl
)

