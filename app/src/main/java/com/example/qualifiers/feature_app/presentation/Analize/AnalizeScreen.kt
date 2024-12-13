package com.example.qualifiers.feature_app.presentation.Analize

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.qualifiers.R
import com.example.qualifiers.feature_app.core.presentation.BottomNavigation
import com.example.qualifiers.feature_app.core.presentation.CatalogAnalizeAdd
import com.example.qualifiers.feature_app.core.presentation.CustomButton
import com.example.qualifiers.feature_app.core.presentation.CustomTextField
import com.example.qualifiers.ui.theme.SF40014White
import com.example.qualifiers.ui.theme.SF40015Black
import com.example.qualifiers.ui.theme.SF40016_939396
import com.example.qualifiers.ui.theme.SF50015White
import com.example.qualifiers.ui.theme.SF50015_7E7E9A
import com.example.qualifiers.ui.theme.SF50016Black
import com.example.qualifiers.ui.theme.SF50016_939396
import com.example.qualifiers.ui.theme.SF60017_939396
import com.example.qualifiers.ui.theme.SF60020Black
import com.example.qualifiers.ui.theme.SF80020White
import com.example.qualifiers.ui.theme._1A6FEE
import com.example.qualifiers.ui.theme._76B3FF
import com.example.qualifiers.ui.theme._92E9D4
import com.example.qualifiers.ui.theme._97D9F0
import com.example.qualifiers.ui.theme._A0A0A04D
import com.example.qualifiers.ui.theme._CDE3FF
import com.example.qualifiers.ui.theme._EBEBEB
import com.example.qualifiers.ui.theme._F5F5F9

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    AnalizeScreen(catalogAnalizeClick = {},{},{},{},{})
}

@Composable
fun AnalizeScreen(
    catalogAnalizeClick: () -> Unit,
    addClick: () -> Unit,
    resultsClick: () -> Unit,
    supportsClick: () -> Unit,
    profileClick: () -> Unit,
    viewModel: AnalizeViewModel = viewModel()
) {
    val findValue = remember { mutableStateOf("") }
    val topPadding = LocalConfiguration.current.screenHeightDp / 15
    val addState = remember { mutableStateOf(false) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CustomTextField(
            findValue.value,
            onValueChanged = {findValue.value = it},
            modifier = Modifier.padding(top = topPadding.dp)
        )
        Column (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 20.dp)
        ){
            Text("Акции и новости", style = SF60017_939396)
            val brush = Brush.verticalGradient(
                listOf(_CDE3FF, _76B3FF)
            )
            LazyRow (
                modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.17f)
            ){
                item {
                    Box(
                        modifier = Modifier.fillParentMaxWidth(0.6f)
                            .fillMaxHeight()
                            .background(brush, RoundedCornerShape(12.dp))
                    ){
                        Column (
                            modifier = Modifier.padding(16.dp)
                        ){
                            Text("Чек-ап для\nмужчин", style = SF80020White)
                            Text("9 исследований", style = SF40014White)
                            Text("8000 ₽ ", style = SF80020White)
                        }
                        Image(
                            painter = painterResource(R.drawable.man),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.align(Alignment.CenterEnd),
                        )
                    }
                }
                item {
                    val brush = Brush.verticalGradient(
                        listOf(_97D9F0, _92E9D4)
                    )
                    Box(
                        modifier = Modifier.fillParentMaxWidth(0.6f)
                            .fillMaxHeight()
                            .padding(horizontal = 20.dp)
                            .background(brush, RoundedCornerShape(12.dp))
                    ){
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ){
                            Text("Подготовка к вакцинации", style = SF80020White)
                            Text("Комплексное обследование\n" +
                                    "перед вакцинацией", style = SF40014White)
                            Text("4000 ₽  ", style = SF80020White)
                        }
                    }
                }
            }
        }

        Column (
            modifier = Modifier.fillMaxWidth()
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


        CatalogAnalizeAdd(
            addClick = {
                addState.value = !addState.value
            }
        )
    }
    Box(
        modifier = Modifier.fillMaxSize()
            .background(_A0A0A04D),
        contentAlignment = Alignment.BottomCenter
    ){
        BottomNavigation({},resultsClick,supportsClick,profileClick,
            modifier = Modifier.fillMaxWidth(), state = 0)
    }
    if (!addState.value){
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ){
            Column(
                modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.8f)
                    .align(Alignment.BottomCenter)
                    .background(Color.White, RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row (verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text("Клинический анализ крови с\nлейкоцитарной формулой",
                        style = SF60020Black)
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.close),
                        contentDescription = "close",
                        modifier = Modifier.clickable{
                            addState.value = !addState.value
                        }
                    )
                }
                Column {
                    Column {
                        Text("Описание", style = SF50016_939396)
                        Text("Клинический анализ крови – это самое важное комплексное лабораторное исследование" +
                                " при обследовании человека с любым заболеванием. Изменение исследуемых показателей, как " +
                                "правило, происходит задолго до появления видимых симптомов болезни. ",
                            style = SF40015Black
                            )
                    }
                    Column {
                        Text("Подготовка", style = SF50016_939396)
                        Column {
                            Text("Кровь следует сдавать утром натощак, днем или вечером – через 4-5 часов после последнего приема пищи.",
                                style = SF40015Black)
                            Text("За 1–2 дня до исследования необходимо исключить из рациона продукты с высоким содержанием жиров и алкоголь.",
                                style = SF40015Black)
                        }
                    }
                }

                Row (
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Column {
                        Text("Результаты через:", style = SF60017_939396)
                        Text("1 день", style = SF50016Black)
                    }
                    Column {
                        Text("Биоматериал:", style = SF60017_939396)
                        Text("1 день", style = SF50016Black)
                    }
                }

                CustomButton("Добавить за 690 ₽",
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 20.dp)) {
                    addState.value = !addState.value
                }
            }
        }
    }
}