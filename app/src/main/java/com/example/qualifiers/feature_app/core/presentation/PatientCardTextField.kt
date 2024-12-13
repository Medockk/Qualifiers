package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qualifiers.R
import com.example.qualifiers.ui.theme.SF40015Black
import com.example.qualifiers.ui.theme.SF40016_939396
import com.example.qualifiers.ui.theme._EBEBEB
import com.example.qualifiers.ui.theme._F5F5F9

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
    PatientCardTextField("", {}, modifier = Modifier
        .height(50.dp)
        .padding(top = 100.dp), "")
}

@Composable
fun PatientCardTextField(
    value: String,
    onValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    hintText: String,
    isGender: Boolean = false
) {
    TextField(
        value = value,
        onValueChange = onValueChanged,
        textStyle = SF40015Black,
        modifier = modifier.fillMaxWidth()
            .border(1.dp, _EBEBEB, RoundedCornerShape(10.dp)),
        placeholder = {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                Text(hintText, style = SF40016_939396)
                if (isGender){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = null
                    )
                }
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