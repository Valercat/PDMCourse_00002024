package com.valeria.movieapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.valeria.movieapp.data.database.dao.FavouriteMovieDao
import com.valeria.movieapp.data.database.dao.MovieDao
import com.valeria.movieapp.data.database.entities.FavoriteMovieEntity
import com.valeria.movieapp.data.database.entities.MovieEntity
import com.valeria.movieapp.data.database.util.Converters

@Database(
    entities = [MovieEntity::class, FavoriteMovieEntity::class],
    version = 2,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun favouriteMovieDao(): FavouriteMovieDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context = context.applicationContext,
                    klass = AppDatabase::class.java,
                    name = "movies_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { INSTANCE = it }
            }
        }
    }
}
