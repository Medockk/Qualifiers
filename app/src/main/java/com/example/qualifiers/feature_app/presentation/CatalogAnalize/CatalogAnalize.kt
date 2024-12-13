package com.example.qualifiers.feature_app.presentation.CatalogAnalize

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qualifiers.feature_app.core.presentation.BottomNavigation
import com.example.qualifiers.feature_app.core.presentation.CatalogAnalizeAdd
import com.example.qualifiers.feature_app.core.presentation.CustomTextField

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    CatalogAnalize({},{},{}){}
}

@Composable
fun CatalogAnalize(
    addClick: () -> Unit,
    profile: () -> Unit,
    resultsClick: () -> Unit,
    supportsClick: () -> Unit
) {

    val padTop = LocalConfiguration.current.screenHeightDp / 15
    val findValue = remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = padTop.dp)
    ){
        CustomTextField(
            value = findValue.value,
            onValueChanged = {findValue.value = it},
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
        )

        com.example.qualifiers.feature_app.core.presentation.CatalogAnalize(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.15f)
        ){

        }

        CatalogAnalizeAdd(
            modifier = Modifier.fillMaxHeight(0.95f),
            cardModifier = Modifier.fillMaxHeight(0.05f),
            addClick = addClick
        )
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        BottomNavigation({},resultsClick,supportsClick,profile,
            state = 0)
    }
}