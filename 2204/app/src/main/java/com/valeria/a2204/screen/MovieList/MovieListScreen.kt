package com.valeria.a2204.screen.MovieList

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.valeria.a2204.AppScafold
import com.valeria.a2204.ListTest.ListTest
import com.valeria.a2204.components.MovieItem
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.material3.AppScaffold
import androidx.wear.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.getValue

@Composable

fun MovieListScreen(
    navigateToDetail: (Int) -> Unit,
    viewModel: MovieListViewModel = viewModel()
) {

    val movies by viewModel.movies.collectAsState()
    val loading by viewModel.loading.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadMovies()
    }

    if (loading) {
        AppScaffold(title = "Movies") { padding ->
            CircularProgressIndicator(modifier = Modifier.padding(padding))
        }
        return
    }

    AppScaffold(title = "Movies") { padding ->
        LazyColumn(
            modifier = Modifier
            .fillMaxSize()
            .padding(padding)
            .padding(16.dp),
        ) {
        items(ListTest) { movie ->
            items(movies) { movie ->
                MovieItem(
                    movie = movie,
                    onClick = { navigateToDetail(movie.id) }
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
    }