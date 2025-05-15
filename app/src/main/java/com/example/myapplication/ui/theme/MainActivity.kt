package com.example.jercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun Function_Ejemplo(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Login de recolección", style = MaterialTheme.typography.headlineSmall)
        val ancho = 15.0
        val largo = 10.0
        val resultado = ancho * largo

        Text(text = "Área de rectángulo: $resultado", color = Color.Red)
    }
}

@Composable
fun Ejercicio3(name: String, modifier: Modifier = Modifier) {
    Row (modifier = Modifier.fillMaxWidth().height(35.dp).background(color = Color(red = 112, green =  77 , blue = 255))){  }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            textDecoration = TextDecoration.Underline,
            text = name,
            textAlign = TextAlign.Center,
            color = Color(red = 112, green =  77 , blue = 255),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.fillMaxWidth()
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        var largo by remember { mutableStateOf("") }
        var ancho by remember { mutableStateOf("") }
        var respuesta by remember { mutableStateOf("") }

        OutlinedTextField(
            value = largo,
            onValueChange = { largo = it },
            label = { Text("Nombre de usuario", color = Color.LightGray) },
            modifier = Modifier
                .fillMaxWidth(),
            singleLine = true
        )

        OutlinedTextField(
            value = ancho,
            onValueChange = { ancho = it },
            label = { Text("Contraseña", color = Color.LightGray) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                ,
            singleLine = true
        )

        Button(
            onClick = {
                val l = largo.toDoubleOrNull()
                val a = ancho.toDoubleOrNull()
                respuesta = if (l != null && a != null) {
                    (l * a).toString()
                } else {
                    "Valores inválidos"
                }
            }
            , shape = CutCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor=Color(red = 112, green =  77 , blue = 255))
            ,
            modifier = Modifier.padding(vertical = 8.dp).align(Alignment.CenterHorizontally)
        ) {
            Text("Ingresar  ", )
            Icon(imageVector = Icons.Filled.Send, contentDescription = null)
        }


    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ){
        AsyncImage(
            model = "https://example.com/image.jpg",
            contentDescription = null,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Column () {
            Ejercicio3("Iniciar sesión en ECOLIM S.A.C")
        }
    }
}