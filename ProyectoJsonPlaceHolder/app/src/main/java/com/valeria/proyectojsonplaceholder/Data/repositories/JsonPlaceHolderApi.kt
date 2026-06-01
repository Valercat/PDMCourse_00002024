package com.valeria.proyectojsonplaceholder.Data.repositories

import android.util.Log

import com.valeria.proyectojsonplaceholder.Data.api.KtorClient
import com.valeria.proyectojsonplaceholder.Data.api.dto.JsonDTO
import com.valeria.proyectojsonplaceholder.Data.api.dto.JsonPostDTO
import com.valeria.proyectojsonplaceholder.Data.api.dto.toModel
import com.valeria.proyectojsonplaceholder.Model.JsonModel
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.utils.EmptyContent.contentType
import io.ktor.http.ContentType
import io.ktor.http.contentType

class JsonPlaceHolderApi : JsonPlaceholderInterface{
    override suspend fun getJsonList(): Result<List<JsonModel>> {
        try {
            val response: List<JsonDTO> = KtorClient.client.get("posts")
//            {
//                parameter("language", "es-SV")
//            }
                .body()

            return Result.success(response.map { apiJson -> apiJson.toModel() })
        }
        catch (e: Exception){
            Log.e("JsonPlaceHolder", "Error al obtener lista de JSONs: ${e.message}")
            return Result.failure(e)
        }
    }

    override suspend fun postJson(title: String,
                                  body: String
    ): Result<JsonDTO> {
        try {
            val request = JsonPostDTO(
                title = title,
                body = body,
                userId = 1
            )

            val response: JsonDTO = KtorClient.client
                .post("https://jsonplaceholder.typicode.com/posts") {
                    contentType(ContentType.Application.Json)
                    setBody(request)
                }
                .body()

            return Result.success(response)
        } catch (e: Exception) {
            Log.e("PostRepository", "Error al crear post: ${e.message}")
            return Result.failure(e)
        }
    }}