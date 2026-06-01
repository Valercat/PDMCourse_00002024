package com.valeria.proyectojsonplaceholder.Data.api.dto

import com.valeria.proyectojsonplaceholder.Model.JsonModel
import kotlinx.serialization.Serializable

@Serializable
data class JsonDTO
    (
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
    ) {
}

fun JsonDTO.toModel(): JsonModel {
    return JsonModel(
        userId = userId,
        id = id,
        title = title,
        body = body
    )
}
