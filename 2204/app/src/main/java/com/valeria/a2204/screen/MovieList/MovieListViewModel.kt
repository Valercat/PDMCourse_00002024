package com.valeria.a2204.screen.MovieList

import android.graphics.Movie
import androidx.lifecycle.ViewModel
import com.valeria.a2204.ListTest.ListTest
import com.valeria.a2204.model.MovieM
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MovieListViewModel : ViewModel(){
    private val _movies = MutableStateFlow<List<MovieM>>(ListTest)
    val movies = _movies.asStateFlow()

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading.asStateFlow()

    fun loadMovies(){
        _loading.value = true
        _movies.value = ListTest
        _loading.value = false
    }
}