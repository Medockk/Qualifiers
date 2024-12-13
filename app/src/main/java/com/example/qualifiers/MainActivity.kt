package com.example.qualifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.qualifiers.feature_app.Navigation.Nav
import com.example.qualifiers.feature_app.core.presentation.CustomTextField
import com.example.qualifiers.feature_app.data.network.enterData
import com.example.qualifiers.feature_app.presentation.Analize.AnalizeScreen
import com.example.qualifiers.feature_app.presentation.CatalogAnalize.CatalogAnalize
import com.example.qualifiers.feature_app.presentation.PatientCard.PatientCardScreen
import com.example.qualifiers.ui.theme.QualifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QualifiersTheme {
                val navController = rememberNavController()

                NavHost(navController, startDestination = Nav.AnalizeScreen.route){
                    composable(Nav.AnalizeScreen.route){
                        AnalizeScreen(
                            catalogAnalizeClick = {
                                navController.navigate(Nav.CatalogAnalize.route){
                                    popUpTo(Nav.AnalizeScreen.route){
                                        inclusive = true
                                    }
                                }
                            },
                            addClick = {

                            },
                            resultsClick = {

                            },
                            supportsClick = {

                            },
                            profileClick = {
                                navController.navigate(Nav.PatientCardScreen.route){
                                    popUpTo(Nav.AnalizeScreen.route){
                                        inclusive = true
                                    }
                                }
                            }
                        )
                    }
                    composable(Nav.CatalogAnalize.route){
                        CatalogAnalize(
                            addClick = {

                            },
                            resultsClick = {

                            },
                            supportsClick = {

                            },
                            profile = {
                                navController.navigate(Nav.PatientCardScreen.route){
                                    popUpTo(Nav.CatalogAnalize.route){
                                        inclusive = true
                                    }
                                }
                            }
                        )
                    }
                    composable(Nav.PatientCardScreen.route){
                        PatientCardScreen(
                            analizeClick = {
                                navController.navigate(Nav.AnalizeScreen.route){
                                    popUpTo(Nav.PatientCardScreen.route){
                                        inclusive = true
                                    }
                                }
                            },
                            resultsClick = {

                            },
                            supportsClick = {

                            }
                        )
                    }
                }
            }
        }
    }
}
