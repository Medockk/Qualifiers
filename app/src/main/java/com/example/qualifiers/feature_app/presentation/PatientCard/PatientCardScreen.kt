package com.example.qualifiers.feature_app.presentation.PatientCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qualifiers.R
import com.example.qualifiers.feature_app.core.presentation.BottomNavigation
import com.example.qualifiers.feature_app.core.presentation.CustomButton
import com.example.qualifiers.feature_app.core.presentation.PatientCardTextField
import com.example.qualifiers.feature_app.data.network.enterData
import com.example.qualifiers.ui.theme.SF40014_939396
import com.example.qualifiers.ui.theme.SF70024Black

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    PatientCardScreen(Modifier, {},{},{})
}

@Composable
fun PatientCardScreen(
    modifier: Modifier = Modifier,
    analizeClick: () -> Unit,
    resultsClick: () -> Unit,
    supportsClick: () -> Unit
) {

    val name = remember { mutableStateOf("") }
    val surname = remember { mutableStateOf("") }
    val patronymic = remember { mutableStateOf("") }
    val birthdayData = remember { mutableStateOf("") }
    val gender = remember { mutableStateOf("") }
    val paddingBottom = LocalConfiguration.current.screenHeightDp / 10
    val paddingTop = LocalConfiguration.current.screenHeightDp / 15

    Column(
        modifier = modifier.fillMaxSize()
            .padding(start = 20.dp, end = 20.dp,
                bottom = paddingBottom.dp, top = paddingTop.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Карта пациента", style = SF70024Black)
            Image(
                painter = painterResource(R.drawable.card_icon),
                contentDescription = "card icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth(0.35f)
            )
            Text("Без карты пациента вы не сможете заказать анализы.",
                style = SF40014_939396,
                modifier = Modifier.align(Alignment.Start))
            Text("В картах пациентов будут храниться результаты анализов вас и ваших близких.",
                style = SF40014_939396)
        }

        LazyColumn (
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.7f)
        ){
            item {
                PatientCardTextField(
                    value = name.value,
                    onValueChanged = {name.value = it},
                    hintText = "Name"
                )
            }
            item {
                PatientCardTextField(
                    value = surname.value,
                    onValueChanged = {surname.value = it},
                    hintText = "surname"
                )
            }
            item {
                PatientCardTextField(
                    value = patronymic.value,
                    onValueChanged = {patronymic.value = it},
                    hintText = "patronymic"
                )
            }
            item {
                PatientCardTextField(
                    value = birthdayData.value,
                    onValueChanged = {birthdayData.value = it},
                    hintText = "birthdayData"
                )
            }
            item {
                PatientCardTextField(
                    value = gender.value,
                    onValueChanged = {gender.value = it},
                    hintText = "Gender",
                    isGender = true
                )
            }
        }

        CustomButton(
            "Сохранить",
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(0.35f)
        ) {
            enterData(
                name = name.value, surname = surname.value,
                patronymic = patronymic.value,
                birthdayData = birthdayData.value, gender = gender.value
            )
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        BottomNavigation(analizeClick,resultsClick,supportsClick,{},
            state = 3)
    }
}