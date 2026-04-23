package com.valeria.clase2004

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.runtime.NavEntry
import com.valeria.clase2004.screen.HomeScreen
import com.valeria.clase2004.screen.ProfileScreen

data object Home
data class Profile(val userId : String)

@Composable
fun MainNavigation(){
    val backStack = remember {mutableStateListOf<Any>(Home)}

    NavDisplay(
        backStack = backStack,
        //pantalla
        onBack = { backStack.removeLastOrNull()},
        entryProvider = {entry ->
            when(entry){
                is Home -> NavEntry(entry){HomeScreen(navigateToProfile = {userId ->
                    backStack.add(Profile(userId))
                })}
                is Profile -> NavEntry(entry){ProfileScreen()}
                else -> null
            }!!
        }
    )
}