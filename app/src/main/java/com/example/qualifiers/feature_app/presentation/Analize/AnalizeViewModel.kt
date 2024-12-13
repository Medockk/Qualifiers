package com.example.qualifiers.feature_app.presentation.Analize

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AnalizeViewModel : ViewModel() {

    private val _state = mutableStateOf(AnalizeState())
    val state: State<AnalizeState> = _state

    fun onEvent(event: AnalizeEvent){
        when (event){
            AnalizeEvent.AddClick -> {

            }
            AnalizeEvent.ProfileClick -> {

            }
            AnalizeEvent.ResultsClick -> {

            }
            AnalizeEvent.SupportsClick -> {

            }

            is AnalizeEvent.FindText -> {
                _state.value = state.value.copy(
                    findText = event.value
                )
            }
        }
    }
}