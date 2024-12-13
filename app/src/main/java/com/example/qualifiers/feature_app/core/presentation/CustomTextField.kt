package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qualifiers.R
import com.example.qualifiers.ui.theme.SF40016_939396
import com.example.qualifiers.ui.theme._EBEBEB
import com.example.qualifiers.ui.theme._F5F5F9

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    CustomTextField("", {}, modifier = Modifier
        .height(50.dp)
        .padding(top = 100.dp))
}

@Composable
fun CustomTextField(
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    TextField(
        value = value,
        onValueChange = onValueChanged,
        modifier = modifier.fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
            .border(1.dp, _EBEBEB, RoundedCornerShape(10.dp)),
        placeholder = {
            Row {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.icons),
                    contentDescription = "find"
                )
                Text("Искать анализы", style = SF40016_939396)
            }
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedContainerColor = _F5F5F9,
            unfocusedContainerColor = _F5F5F9,
        ),
        shape = RoundedCornerShape(10.dp),
    )
}