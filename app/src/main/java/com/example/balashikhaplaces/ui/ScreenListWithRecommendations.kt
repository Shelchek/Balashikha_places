package com.example.balashikhaplaces.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.balashikhaplaces.data.Categories
import com.example.balashikhaplaces.data.Place
import com.example.balashikhaplaces.data.places

@Composable
fun ListRecommendations(categoryType: Categories, modifier: Modifier = Modifier, onRecommendationPressed: (Place) -> Unit) {
    val catList = places[categoryType]
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start) {
        catList!!.forEach {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .clickable { onRecommendationPressed(it) },
                elevation = 4.dp) {
                Row(modifier = Modifier.padding(15.dp)) {
                    Image(
                        painter = painterResource(id = it.picture),
                        contentDescription = "picture ${it.name}",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(RoundedCornerShape(15.dp)),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column(modifier = Modifier.height(60.dp), verticalArrangement = Arrangement.Center) {
                        Text(text = stringResource(id = it.name))
                    }
                }
            }
            
        }
    }
}

