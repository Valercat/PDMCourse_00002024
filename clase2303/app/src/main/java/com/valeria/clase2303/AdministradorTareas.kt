package com.valeria.clase2303

import android.R.attr.textSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.valeria.clase2303.ui.theme.Clase2303Theme

@Composable
fun Administrador(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            val image = painterResource(R.drawable.ic_task_completed)
            Image(
                painter = image,
                contentDescription = null,

            )
        }
        Box(modifier = Modifier.fillMaxWidth() ,contentAlignment = Alignment.Center){
            Text(
                text = stringResource(R.string.tasks),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(0.dp, 24.dp, 0.dp,8.dp )
            )
        }
        Box(modifier = Modifier.fillMaxWidth() , contentAlignment = Alignment.Center){
            Text(
                text = stringResource(R.string.nice_work),
                fontSize = 16.sp
            )
        }
    }
}

@Composable
@Preview
fun PreviewAdministrador(){
    Clase2303Theme {
        Administrador()
    }
}