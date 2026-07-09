package com.valeria.movieapp.data.database.util

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class Converters {
    @TypeConverter
    fun fromString(value: String): List<Int> {
        return Json.decodeFromString(value)
    }

    @TypeConverter
    fun fromList(list: List<Int>): String {
        return Json.encodeToString(list)
    }
}
