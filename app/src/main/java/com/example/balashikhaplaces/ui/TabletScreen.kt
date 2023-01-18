package com.example.balashikhaplaces.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TabletScreenRecommendations() {
    val viewModel: PlaceViewModel = viewModel()

    Row {
        CityDescriptionCategoriesScreen(onCategoryPressed = {viewModel.category = it}, modifier = Modifier.weight(1F))
        ListRecommendations(
            categoryType = viewModel.category,
            onRecommendationPressed = {viewModel.place = it},
            modifier = Modifier.weight(1F)
        )
        DetailedRecommendation(place = viewModel.place, modifier = Modifier.weight(1F))
    }
}