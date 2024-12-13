package com.example.qualifiers.feature_app.Navigation

sealed class Nav(val route: String) {

    data object AnalizeScreen: Nav("AnalizeScreen")
    data object CatalogAnalize: Nav("CatalogAnalize")
    data object PatientCardScreen: Nav("PatientCardScreen")
}