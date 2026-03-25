package com.valeria.clase2303

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valeria.clase2303.ui.theme.Clase2303Theme

@Composable
fun EjercicioUno(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()){
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(color = Color.Cyan), contentAlignment = Alignment.Center){
            Text(text = "Ejemplo 1" /*R.string.app_name*/)

        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth()){
            Row(modifier = Modifier.fillMaxWidth()){
                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Red), contentAlignment = Alignment.TopCenter){
                    Text(text = "Ejemplo 2")
                }
                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Green)){
                    Text(text = "Ejemplo 3")
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(color = Color.Magenta), contentAlignment = Alignment.BottomCenter){
            Text(text = "Ejemplo 4")
        }
    }
}
//copilot github

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    Clase2303Theme {
        EjercicioUno()
    }
}