package com.valeria.clase2303

import android.provider.Settings.Global.getString
import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.valeria.clase2303.ui.theme.Clase2303Theme

@Composable
fun Articulo(){

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxWidth()) {
            val image = painterResource(R.drawable.bg_compose_background)
            Image(
                painter = image,
                contentDescription = null,
                //se deja nulo porque no interesa saber de que trata para talkback de accesibilidad
            )
        }
        Box(){
            Text(
                text = stringResource(R.string.JCT),
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        Box() {
            Text(
                text = stringResource(R.string.JPC_is),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp, 0.dp, 16.dp)
            )
        }
        Box() {
            Text(
                text = stringResource(R.string.JPC_tuto),
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}


@Composable
@Preview
fun PreviewArticle(){
    Clase2303Theme {
        Articulo()
    }
}