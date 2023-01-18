package com.example.balashikhaplaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.balashikhaplaces.data.Categories
import com.example.balashikhaplaces.data.places
import com.example.balashikhaplaces.ui.*
import com.example.balashikhaplaces.ui.theme.BalashikhaPlacesTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BalashikhaPlacesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val windowSize = calculateWindowSizeClass(activity = this)
                    if (windowSize.widthSizeClass == WindowWidthSizeClass.Expanded) {
                        TabletScreenRecommendations()
                    } else {
                        SmallScreenRecommendations()
                    }
                }
            }
        }

    }
}

