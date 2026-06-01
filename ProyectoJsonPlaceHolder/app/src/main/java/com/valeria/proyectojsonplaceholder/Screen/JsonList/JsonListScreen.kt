package com.valeria.proyectojsonplaceholder.Screen.JsonList

import androidx.lifecycle.viewmodel.compose.viewModel

fun JsonListScreen(){
    val viewModel: JsonListViewModel = viewModel()
    val listScreen by viewModel.collectAsState()

}