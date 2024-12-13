package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.qualifiers.ui.theme.SF50015White
import com.example.qualifiers.ui.theme.SF50015_7E7E9A
import com.example.qualifiers.ui.theme.SF60017_939396
import com.example.qualifiers.ui.theme._1A6FEE
import com.example.qualifiers.ui.theme._F5F5F9

@Composable
fun CatalogAnalize(
    modifier: Modifier = Modifier,
    catalogAnalizeClick: () -> Unit
) {
    Column (
        modifier = modifier.fillMaxWidth()
            .fillMaxHeight(0.18f)
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Text("Каталог анализов", style = SF60017_939396)
        LazyRow(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.8f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            item{
                Box(
                    modifier = Modifier.fillParentMaxWidth(0.3f)
                        .fillMaxHeight(0.8f)
                        .padding(end = 16.dp)
                        .background(_1A6FEE, RoundedCornerShape(10.dp))
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){
                            catalogAnalizeClick()
                        },
                    contentAlignment = Alignment.Center
                ){
                    Text("Популярные", style = SF50015White)
                }
            }
            item {
                Box(
                    modifier = Modifier.fillParentMaxWidth(0.2f)
                        .fillMaxHeight(0.8f)
                        .padding(end = 16.dp)
                        .background(_F5F5F9, RoundedCornerShape(10.dp))
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){
                            catalogAnalizeClick()
                        },
                    contentAlignment = Alignment.Center
                ){
                    Text("Covid", style = SF50015_7E7E9A)
                }
            }
            item {
                Box(
                    modifier = Modifier.fillParentMaxWidth(0.35f)
                        .fillMaxHeight(0.8f)
                        .padding(end = 16.dp)
                        .background(_F5F5F9, RoundedCornerShape(10.dp))
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){
                            catalogAnalizeClick()
                        },
                    contentAlignment = Alignment.Center
                ){
                    Text("Комплексные", style = SF50015_7E7E9A)
                }
            }
            item {
                Box(
                    modifier = Modifier.fillParentMaxWidth(0.2f)
                        .fillMaxHeight(0.8f)
                        .padding(end = 16.dp)
                        .background(_F5F5F9, RoundedCornerShape(10.dp))
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){
                            catalogAnalizeClick()
                        },
                    contentAlignment = Alignment.Center
                ){
                    Text("Чекапы", style = SF50015_7E7E9A)
                }
            }
        }
    }
}