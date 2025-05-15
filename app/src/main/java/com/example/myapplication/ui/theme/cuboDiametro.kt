package com.example.jercicio2
import kotlin.math.cbrt
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class CuboDiametro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview2()
                }
            }
        }
    }
}

@Composable
fun Function_Ejemplo1(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Calculando área", style = MaterialTheme.typography.headlineSmall)
        val ancho = 15.0
        val largo = 10.0
        val resultado = ancho * largo

        Text(text = "Área de rectángulo: $resultado", color = Color.Red)
    }
}

@Composable
fun Ejercicio31(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp, top = 50.dp)) {
        Text(
            text = name,
            textAlign = TextAlign.Center,
            color = Color.Black,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.fillMaxWidth(),

        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        var lado by remember { mutableStateOf("") }
        var respuesta by remember { mutableStateOf("") }

        OutlinedTextField(
            value = lado,
            onValueChange = { lado = it },
            label = { Text("Lado") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            singleLine = true
        )



        Button(
            onClick = {
                val l = lado.toDoubleOrNull()
                respuesta = if (l != null ) {
                    (l *cbrt(3.toDouble())).toString()
                } else {
                    "Valores inválidos"
                }
            },
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text("Calcular")
        }

        Text(
            text = "La diagonal del cubo es: $respuesta",
            color = Color.Blue,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    MyApplicationTheme {
        Column {
           // Function_Ejemplo1("Cálculo de área")
            Ejercicio31("Calculador el diametro de un cubo")
        }
    }
}