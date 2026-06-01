package com.valeria.proyectojsonplaceholder.Screen.JsonList

import androidx.lifecycle.ViewModel
import com.valeria.proyectojsonplaceholder.Data.repositories.JsonPlaceHolderApi
import com.valeria.proyectojsonplaceholder.Data.repositories.JsonPlaceholderInterface
import com.valeria.proyectojsonplaceholder.Model.JsonModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.json.Json

class JsonListViewModel : ViewModel(){
//    private val _uiState = MutableStateFlow(JsonPlaceHolderApi())
//    val uiState: StateFlow<JsonListUiState> = _uiState.asStateFlow()

    private val jsonRepository: JsonPlaceholderInterface = JsonPlaceHolderApi()

    private val _jsonList = MutableStateFlow<List<JsonModel>>(emptyList())
    val jsonList = _jsonList.asStateFlow()





}