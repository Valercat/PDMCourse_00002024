package com.valeria.a2204.model

data class MovieM(
    val id :Int,
    val title: String,
    val description: String,
    val rating: Double,
    val releaseDate: String,
    val genreId: List<Int>,
    val poster: String,
    val backgrondPoster: String
    )