package com.valeria.proyectojsonplaceholder.Data.api.dto

import kotlinx.serialization.Serializable

@Serializable
data class JsonPostDTO (
    val title: String,
    val body: String,
    val userId: Int
)