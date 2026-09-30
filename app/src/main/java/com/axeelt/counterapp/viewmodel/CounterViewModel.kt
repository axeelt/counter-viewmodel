package com.axeelt.counterapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var contador by mutableIntStateOf(0)
        private set

    fun incrementar() {
        contador++
    }

    fun disminuir() {
        if (contador > 0) {
            contador--
        }
    }

    fun reiniciar() {
        contador = 0
    }
}

