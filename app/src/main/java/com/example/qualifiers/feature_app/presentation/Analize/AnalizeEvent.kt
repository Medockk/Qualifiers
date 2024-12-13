package com.example.qualifiers.feature_app.presentation.Analize

sealed class AnalizeEvent {

    data object ResultsClick : AnalizeEvent()
    data object SupportsClick : AnalizeEvent()
    data object ProfileClick : AnalizeEvent()
    data object AddClick : AnalizeEvent()

    data class FindText(val value: String) : AnalizeEvent()
}