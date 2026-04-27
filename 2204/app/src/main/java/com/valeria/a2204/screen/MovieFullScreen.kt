package com.valeria.a2204.screen

//import androidx.wear.compose.material3.AppScaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.valeria.a2204.AppScafold
import com.valeria.a2204.ListTest.ListTest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieFullScreen(movieId: Int, navigateBack: () -> Unit) {
    val listTest = ListTest
    val movie = ListTest.find { it.id == movieId }
    AppScafold(Modifier, "Movie List", navigationIcon = {
        IconButton(onClick = navigateBack) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        }
    }) { padding ->
        movie?.let {
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())) {
                AsyncImage(model = it.backgrondPoster,
                    contentDescription = it.title,
                    modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
                    contentScale = ContentScale.Crop
                )
                Column() {
                    Text(it.title)
                    Spacer(modifier = Modifier.size(5.dp))
                    Text(it.description)
                    Spacer(modifier = Modifier.size(5.dp))
                    Text("Rating: ${"%.2f".format(it.rating)} ")
                    Spacer(modifier = Modifier.size(5.dp))
                    Text(it.releaseDate)
                    Spacer(modifier = Modifier.size(5.dp))
                }
            }
        }
    }
}
//
//@Composable
//fun MovieDetailScreen(
//    movieId: Int,
//    navigateBack: () -> Unit
//) {
//    val movie = dummyMovies.find { it.id == movieId }
//
//    AppScaffold(
//        title = movie?.title ?: "Detail",
//        navigationIcon = {
//            IconButton(onClick = navigateBack) {
//                Icon(
//                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
//                    contentDescription = "Back"
//                )
//            }
//        }
//    ) { padding ->
//        movie?.let {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(padding)
//                    .verticalScroll(rememberScrollState())
//            ) {
//                AsyncImage(
//                    model = it.backdropUrl,
//                    contentDescription = it.title,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(220.dp),
//                    contentScale = ContentScale.Crop
//                )
//                Column(modifier = Modifier.padding(16.dp)) {
//                    Text(
//                        text = it.title,
//                        style = MaterialTheme.typography.headlineSmall,
//                        fontWeight = FontWeight.Bold
//                    )
//                    Spacer(modifier = Modifier.height(4.dp))
//                    Text(
//                        text = it.originalTitle,
//                        style = MaterialTheme.typography.bodyMedium,
//                        color = MaterialTheme.colorScheme.onSurfaceVariant
//                    )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    Text(
//                        text = "Rating: ${"%.2f".format(it.voteAverage)}  -  ${it.releaseDate}",
//                        style = MaterialTheme.typography.bodyMedium
//                    )
//                    Spacer(modifier = Modifier.height(8.dp))
//                    Text(
//                        text = "Popularidad: ${"%.1f".format(it.popularity)}",
//                        style = MaterialTheme.typography.bodySmall,
//                        color = MaterialTheme.colorScheme.onSurfaceVariant
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Text(
//                        text = "Sinopsis",
//                        style = MaterialTheme.typography.titleMedium,
//                        fontWeight = FontWeight.Bold
//                    )
//                    Spacer(modifier = Modifier.height(4.dp))
//                    Text(
//                        text = it.overview,
//                        style = MaterialTheme.typography.bodyMedium
//                    )
//                }
//            }
//        }
//    }
//}