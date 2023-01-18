package com.example.balashikhaplaces.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.balashikhaplaces.data.Categories
import com.example.balashikhaplaces.data.Place
import com.example.balashikhaplaces.data.places
import kotlinx.coroutines.flow.MutableStateFlow

class PlaceViewModel() : ViewModel() {

    var place by mutableStateOf(places[Categories.HOSPITAL]!![0])
    var category by mutableStateOf(Categories.HOSPITAL)
}

//class PlaceViewModelFactory(private val place: Place, private val category: Categories) : ViewModelProvider.NewInstanceFactory() {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return PlaceViewModel(place, category) as T
//    }
//}