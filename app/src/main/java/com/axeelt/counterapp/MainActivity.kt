package com.axeelt.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.axeelt.counterapp.ui.theme.CounterAppTheme
import com.axeelt.counterapp.uii.CounterScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CounterAppTheme {
                CounterScreen()
            }
        }
    }
}