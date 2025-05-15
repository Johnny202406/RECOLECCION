package com.example.jercicio2
import kotlin.math.cbrt
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class NoseXd : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview3()
                }
            }
        }
    }
}

@Composable
fun Function_Ejemplo2(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Calculando área", style = MaterialTheme.typography.headlineSmall)
        val ancho = 15.0
        val largo = 10.0
        val resultado = ancho * largo

        Text(text = "Área de rectángulo: $resultado", color = Color.Red)
    }
}

@Composable
fun Ejercicio32(name: String, modifier: Modifier = Modifier) {
    LazyColumn {
            item {
                hola()
            }
            item {
               val resu: Int=suma(3,4)
                Text(text = "El resultado es: $resu")
            }
            item {
                Text(text = "White")
                var num = 1
                while (num<=5){
                    Text(text = "$num", color = Color.Red)
                    num ++
                }
            }
            item {
                var num2=1
                do {
                    Text(text = "$num2", color = Color.Yellow)
                    num2 ++
                }
                while (num2<=5)
            }

    }
}
@Composable
fun hola(){
    Text(text = "Hola desde otra funcion", color = Color.Blue)
}

fun suma(a: Int,b: Int): Int{
     return a+b
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
        Ejercicio32("Calculador el diametro de un cubo")

}