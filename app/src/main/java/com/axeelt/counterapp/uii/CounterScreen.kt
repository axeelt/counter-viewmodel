package com.axeelt.counterapp.uii

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.axeelt.counterapp.viewmodel.CounterViewModel

@Composable
fun CounterScreen(
    viewModel: CounterViewModel = viewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Contador: ${viewModel.contador}"
        )

        Button(
            onClick = {
                viewModel.incrementar()
            }
        ) {
            Text("Incrementar")
        }

        Button(
            onClick = {
                viewModel.disminuir()
            }
        ) {
            Text("Disminuir")
        }

        Button(
            onClick = {
                viewModel.reiniciar()
            }
        ) {
            Text("Reiniciar")
        }
    }
}