package com.example.balashikhaplaces.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.balashikhaplaces.R
import com.example.balashikhaplaces.data.Categories

@Composable
fun CityDescriptionCategoriesScreen(modifier: Modifier = Modifier, onCategoryPressed: (Categories) -> Unit) {
   Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.drawable.balashikha), contentDescription = "Photo of city")

      var isDescriptionExpanded by remember { mutableStateOf(false) }
      val description = stringResource(id = R.string.city_description)

      Column(modifier = Modifier.padding(15.dp)) {
         Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "About city:", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(1F))
            IconButton(onClick = { isDescriptionExpanded = !isDescriptionExpanded }, modifier = Modifier.size(20.dp)) {
               Icon(
                  imageVector = if (isDescriptionExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                  contentDescription = "Expand button"
               )
            }
         }
         Text(
            text = if (isDescriptionExpanded) description else "${description.substring(0, 65)}...",
         )
         Spacer(modifier = Modifier.height(20.dp))
         Button(onClick = { onCategoryPressed(Categories.HOSPITAL) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.categ_hospital))
         }
         Spacer(modifier = Modifier.height(10.dp))
         Button(onClick = { onCategoryPressed(Categories.PHARMACY) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.categ_pharm))
         }
         Spacer(modifier = Modifier.height(10.dp))
         Button(onClick = { onCategoryPressed(Categories.RESTAURANT_CAFFE) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.categ_RestCaffe))
         }
         Spacer(modifier = Modifier.height(10.dp))
         Button(onClick = { onCategoryPressed(Categories.SPORT) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.categ_Sport))
         }
         Spacer(modifier = Modifier.height(10.dp))
         Button(onClick = { onCategoryPressed(Categories.PARK) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = stringResource(id = R.string.categ_Park))
         }
      }
   }
}


