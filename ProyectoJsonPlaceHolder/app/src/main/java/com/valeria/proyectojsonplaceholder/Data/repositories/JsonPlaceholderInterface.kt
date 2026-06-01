package com.valeria.proyectojsonplaceholder.Data.repositories

import com.valeria.proyectojsonplaceholder.Data.api.dto.JsonDTO
import com.valeria.proyectojsonplaceholder.Data.api.dto.JsonPostDTO
import com.valeria.proyectojsonplaceholder.Model.JsonModel

interface JsonPlaceholderInterface {
    suspend fun getJsonList(): Result<List<JsonModel>>
    suspend fun postJson(title: String, body: String): Result<JsonDTO>
}