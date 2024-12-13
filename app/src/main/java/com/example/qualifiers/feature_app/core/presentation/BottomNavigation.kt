package com.example.qualifiers.feature_app.core.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.qualifiers.R
import com.example.qualifiers.ui.theme.SF40012_1A6FEE
import com.example.qualifiers.ui.theme.SF40012_B8C1CC
import com.example.qualifiers.ui.theme._1A6FEE
import com.example.qualifiers.ui.theme._B8C1CC

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun prev() {
BottomNavigation({},{},{},{},)
}

@Composable
fun BottomNavigation(
    analizeClick: () -> Unit,
    resultsClick: () -> Unit,
    supportsClick: () -> Unit,
    profileClick: () -> Unit,
    modifier: Modifier = Modifier,
    state: Int = 0,
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        LazyRow (
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ){
            item {
                Column(
                    modifier = modifier
                        .fillParentMaxWidth(0.2f)
                        .clickable(
                            remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){analizeClick()},
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.analize),
                        contentDescription = null,
                        tint = if (state == 0) _1A6FEE else _B8C1CC
                    )
                    Text("Анализы", style = SF40012_1A6FEE)
                }
            }
            item {
                Column(
                    modifier = modifier
                        .fillParentMaxWidth(0.2f)
                        .clickable(
                            remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){resultsClick()},
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.results),
                        contentDescription = null,
                        tint = if (state == 1) _1A6FEE else _B8C1CC
                    )
                    Text("Результаты", style = SF40012_B8C1CC)
                }
            }
            item {
                Column(
                    modifier = modifier
                        .fillParentMaxWidth(0.2f)
                        .clickable(
                            remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){supportsClick()},
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.supports),
                        contentDescription = null,
                        tint = if (state == 2) _1A6FEE else _B8C1CC
                    )
                    Text("Поддержка", style = SF40012_B8C1CC)
                }
            }
            item {
                Column(
                    modifier = modifier
                        .fillParentMaxWidth(0.2f)
                        .clickable(
                            remember { MutableInteractionSource() },
                            indication = rememberRipple()
                        ){profileClick()},
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.user),
                        contentDescription = null,
                        tint = if (state == 3) _1A6FEE else _B8C1CC
                    )
                    Text("Профиль", style = SF40012_B8C1CC)
                }
            }
        }
    }
}