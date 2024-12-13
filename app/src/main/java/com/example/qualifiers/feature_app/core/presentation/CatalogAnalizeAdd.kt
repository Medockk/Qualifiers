package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.qualifiers.ui.theme.SF50016Black
import com.example.qualifiers.ui.theme.SF60014_939396
import com.example.qualifiers.ui.theme.SF60017Black
import com.example.qualifiers.ui.theme._F4F4F4

@Composable
fun CatalogAnalizeAdd(
    modifier: Modifier = Modifier,
    cardModifier: Modifier = Modifier,
    addClick: () -> Unit
) {
    LazyColumn (
        modifier = modifier.fillMaxWidth()
            .fillMaxHeight(0.8f)
            .padding(horizontal = 20.dp)
    ){
        item {
            Card(
                elevation = CardDefaults.cardElevation(1.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(1.dp, _F4F4F4),
                modifier = cardModifier.fillParentMaxWidth()
                    .fillParentMaxHeight(0.3f),
                onClick = {
                    addClick()
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("ПЦР-тест на определение РНК\nкоронавируса стандартный",
                        style = SF50016Black
                    )
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Column {
                            Text("2 дня", style = SF60014_939396)
                            Text("1800 ₽", style = SF60017Black)
                        }
                        CustomButton(
                            "Добавить",
                        ) {
                            addClick()
                        }
                    }
                }
            }
        }
        item {
            Card(
                elevation = CardDefaults.cardElevation(1.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(1.dp, _F4F4F4),
                modifier = cardModifier.fillParentMaxWidth()
                    .fillParentMaxHeight(0.35f)
                    .padding(vertical = 16.dp),
                onClick = {
                    addClick()
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Клинический анализ крови с\nлейкоцитарной формулировкой",
                        style = SF50016Black
                    )
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Column {
                            Text("1 день", style = SF60014_939396)
                            Text("690 ₽", style = SF60017Black)
                        }
                        CustomButton(
                            "Добавить",
                        ) {
                            addClick()
                        }
                    }
                }
            }
        }
        item {
            Card(
                elevation = CardDefaults.cardElevation(1.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(1.dp, _F4F4F4),
                modifier = cardModifier.fillParentMaxWidth()
                    .fillParentMaxHeight(0.3f),
                onClick = {
                    addClick()
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Клинический анализ крови с\nлейкоцитарной формулировкой",
                        style = SF50016Black
                    )
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Column {
                            Text("1 день", style = SF60014_939396)
                            Text("690 ₽", style = SF60017Black)
                        }
                        CustomButton(
                            "Добавить",
                        ) {
                            addClick()
                        }
                    }
                }
            }
        }
        item {
            Card(
                elevation = CardDefaults.cardElevation(1.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(1.dp, _F4F4F4),
                modifier = cardModifier.fillParentMaxWidth()
                    .fillParentMaxHeight(0.3f)
                    .padding(vertical = 16.dp),
                onClick = {
                    addClick()
                }
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Клинический анализ крови с\nлейкоцитарной формулировкой",
                        style = SF50016Black
                    )
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Column {
                            Text("1 день", style = SF60014_939396)
                            Text("690 ₽", style = SF60017Black)
                        }
                        CustomButton(
                            "Добавить",
                        ) {
                            addClick()
                        }
                    }
                }
            }
        }
    }
}