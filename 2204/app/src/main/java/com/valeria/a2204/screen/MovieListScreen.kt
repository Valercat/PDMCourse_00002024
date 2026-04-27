package com.valeria.a2204.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberOverscrollEffect
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.valeria.a2204.AppScafold
import com.valeria.a2204.ListTest.ListTest
import com.valeria.a2204.components.MovieItem
import androidx.compose.foundation.lazy.items
import com.valeria.a2204.model.MovieM

@Composable
fun MovieListScreen(navigateToDetail: (Int) -> Unit) {
        AppScafold(title = "Movies") { padding ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp),
            ) {
                items(ListTest) { movie ->
                    MovieItem(
                        movie = movie,
                        onClick = { navigateToDetail(movie.id) }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
}