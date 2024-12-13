package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qualifiers.ui.theme.SF60014White
import com.example.qualifiers.ui.theme.SF60014_1A6FEE
import com.example.qualifiers.ui.theme.SF60014_939396
import com.example.qualifiers.ui.theme._1A6FEE

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    CustomButton("title"){}
}

@Composable
fun CustomButton(
    title: String,
    isEmpty: Boolean = false,
    modifier: Modifier = Modifier,
    onclick: () -> Unit

) {
    Button(
        onClick = onclick,
        shape = RoundedCornerShape(10.dp),
        colors = if (isEmpty) {
            ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        }else{
            ButtonDefaults.buttonColors(containerColor = _1A6FEE)
        },
        modifier = modifier
    ) {
        Text(
            title,
            style = if (isEmpty) SF60014_1A6FEE else SF60014White
        )
    }
}