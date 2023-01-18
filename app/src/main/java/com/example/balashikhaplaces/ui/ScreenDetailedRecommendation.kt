package com.example.balashikhaplaces.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.balashikhaplaces.data.Place

@Composable
fun DetailedRecommendation(place: Place, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = place.picture),
            contentDescription = "photo of ${place.name}"
        )
        Spacer(modifier = Modifier.height(8.dp))
        val spacerDpBetweenCards = 15.dp
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 15.dp), elevation = 4.dp
        ) {
            Row(modifier = Modifier.padding(5.dp)) {
                Text(text = "Name:", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = stringResource(id = place.name))
            }
        }
        Spacer(modifier = Modifier.height(spacerDpBetweenCards))
        Card(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .fillMaxWidth(), elevation = 4.dp
        ) {
            Row(modifier = Modifier.padding(5.dp)) {
                Text(text = "Address:", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = stringResource(id = place.address))
            }
        }
        Spacer(modifier = Modifier.height(spacerDpBetweenCards))
        Card(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .fillMaxWidth(), elevation = 4.dp
        ) {
            Row(modifier = Modifier.padding(5.dp)) {
                Text(text = "Description:", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = stringResource(id = place.description))
            }
        }
        Spacer(modifier = Modifier.height(spacerDpBetweenCards))
        Card(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .fillMaxWidth(), elevation = 4.dp
        ) {
            Column(modifier = Modifier.padding(5.dp)) {
                Text(text = "Schedule:", fontWeight = FontWeight.Bold)
                for (i in place.schedule.indices) {
                    Row {
                        Text(
                            text = dayWeek[i],
                            modifier = Modifier
                                .border(1.dp, Color.Gray)
                                .padding(5.dp)
                                .weight(2F)
                        )
                        Text(
                            text = place.schedule[i],
                            modifier = Modifier
                                .border(1.dp, Color.Gray)
                                .padding(5.dp)
                                .weight(3F)
                        )
                    }
                }
            }
        }
    }
}

val dayWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")