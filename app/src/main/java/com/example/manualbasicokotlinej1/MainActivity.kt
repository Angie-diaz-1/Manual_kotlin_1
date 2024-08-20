package com.example.manualbasicokotlinej1

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
import com.example.manualbasicokotlinej1.ui.theme.ManualBasicoKotlinEj1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManualBasicoKotlinEj1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
val dividendo = 12
    val divisor = 3
    val result = divisionRecursiva(dividendo, divisor) // Aquí se hace uso de la función recursiva

    Text(
        text = "dividendo -> $dividendo" +
                "\n divisor -> $divisor" +
                "\n RESULTADO DIVISION  -> $result",
        modifier = modifier
    )
}



fun divisionRecursiva(dividend: Int, divisor: Int): Int {
    // Caso base: si el dividendo es menor que el divisor, la división ha terminado
    return if (dividend < divisor) {
        0
    } else {
        // Llama recursivamente a la función restando el divisor del dividendo
        1 + divisionRecursiva(dividend - divisor, divisor)
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ManualBasicoKotlinEj1Theme {
        Greeting("Android")
    }
}