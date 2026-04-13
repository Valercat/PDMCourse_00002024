package com.valeria.clase2303

import android.R.attr.background
import android.R.id.background
import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valeria.clase2303.ui.theme.Clase2303Theme

@Composable
fun CuadranteCompose(){
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth()){
            Row(modifier = Modifier.fillMaxWidth()){
                Box(modifier = Modifier.weight(1f).background(colorResource(R.color.a)).fillMaxHeight(),
                    contentAlignment = Alignment.Center){
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box() {
                            Text(
                                text = stringResource(R.string.Text),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(0.dp, 0.dp, 0.dp,16.dp )
                            )
                        }
                        Box() {
                            Text(
                                text = stringResource(R.string.Text_inf),
                                textAlign = TextAlign.Center
                                )
                        }
                    }
                }
                Box(modifier = Modifier.weight(1f).background(colorResource(R.color.b)).fillMaxHeight(),
                    contentAlignment = Alignment.Center){
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = stringResource(R.string.Image),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(0.dp, 0.dp, 0.dp,16.dp )
                            )
                            Text(
                                text = stringResource(R.string.Image_inf),
                                textAlign = TextAlign.Center,
                            )
                    }
                }
            }
        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth()){
            Row(modifier = Modifier.fillMaxWidth()){
                Box(modifier = Modifier.weight(1f).background(colorResource(R.color.c)).fillMaxHeight(),
                    contentAlignment = Alignment.Center){
                    Column(modifier = Modifier.padding(16.dp) ,verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box() {
                            Text(
                                text = stringResource(R.string.Row),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(0.dp, 0.dp, 0.dp,16.dp )
                            )
                        }
                        Box() {
                            Text(
                                text = stringResource(R.string.Row_inf),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
                Box(modifier = Modifier.weight(1f).background(colorResource(R.color.d)).fillMaxHeight(),
                    contentAlignment = Alignment.Center){
                    Column(modifier = Modifier.padding(16.dp) ,verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Box() {
                            Text(
                                text = stringResource(R.string.Column),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(0.dp, 0.dp, 0.dp,16.dp )
                            )
                        }
                        Box() {
                            Text(
                                text = stringResource(R.string.Column_inf),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}


//@Composable
//fun Cuadro(titulo: String, descripcion: String, colorB: Color){
//    Box(modifier = background(colorB).fillMaxHeight(),
//        contentAlignment = Alignment.Center){
//        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            Box() {
//                Text(
//                    text = stringResource(R.string.Text),
//                    textAlign = TextAlign.Center,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp,16.dp )
//                )
//            }
//            Box() {
//                Text(
//                    text = stringResource(R.string.Text_inf),
//                    textAlign = TextAlign.Center
//                )
//            }
//        }
//    }
//}

@Composable
@Preview
fun PreviewCuadrante(){
    Clase2303Theme {
        CuadranteCompose()
    }
}