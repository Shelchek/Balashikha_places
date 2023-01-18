package com.example.balashikhaplaces.ui

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.balashikhaplaces.data.Categories
import com.example.balashikhaplaces.data.places

@Composable
fun SmallScreenRecommendations() {
    val viewModel: PlaceViewModel = viewModel()
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = Screens.valueOf(
        backStackEntry?.destination?.route ?: Screens.CATEGORIES.name
    )
    var appBarName = ""
    if (currentScreen == Screens.RECOMMENDATIONS) {
        appBarName = viewModel.category.name
    }
    else if (currentScreen == Screens.DETAILED) {
        appBarName = stringResource(id = viewModel.place.name)
    }
    else {
        appBarName = Screens.CATEGORIES.name
    }
    Scaffold(topBar = {
        PlaceAppBar(
            appBarName = appBarName,
            isCanNavigateBack = navController.previousBackStackEntry != null,
            navigateBack = { navController.navigateUp() }
        )
    }) {
        NavHost(navController = navController, startDestination = Screens.CATEGORIES.name) {
            composable(route = Screens.CATEGORIES.name) {
                CityDescriptionCategoriesScreen(onCategoryPressed = {
                    viewModel.category = it
                    navController.navigate(Screens.RECOMMENDATIONS.name)
                })
            }
            composable(route = Screens.RECOMMENDATIONS.name) {
                ListRecommendations(categoryType = viewModel.category) {
                    viewModel.place = it
                    navController.navigate(Screens.DETAILED.name)
                }
            }
            composable(route = Screens.DETAILED.name) {
                DetailedRecommendation(place = viewModel.place)
            }
        }
    }
}

@Composable
private fun PlaceAppBar(
    appBarName: String,
    isCanNavigateBack: Boolean,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = appBarName) },
        modifier = modifier,
        navigationIcon = {
            if (isCanNavigateBack) {
                IconButton(onClick = navigateBack) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "navigate back button"
                    )
                }
            }
        }
    )
}