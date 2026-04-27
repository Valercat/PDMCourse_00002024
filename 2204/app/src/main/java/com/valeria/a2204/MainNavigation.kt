package com.valeria.a2204

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.valeria.a2204.screen.MovieFullScreen
import com.valeria.a2204.screen.MovieListScreen

@Composable
fun MovieApp() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                MovieListScreen(
                    navigateToDetail = { movieId ->
                        backStack.add(Routes.MovieDetail(movieId))
                    }
                )
            }
            entry<Routes.MovieDetail> { key ->
                MovieFullScreen(
                    movieId = key.movieId,
                    navigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
        }
    )
}