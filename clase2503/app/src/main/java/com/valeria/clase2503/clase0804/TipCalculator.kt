package com.valeria.clase2503.clase0804

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valeria.clase2503.R
import com.valeria.clase2503.ui.theme.Clase2503Theme
import java.text.NumberFormat

@Composable
fun TipCalculator (modifier: Modifier = Modifier) {
    var amountInput by rememberSaveable { mutableStateOf("") }
    var amountInput2 by rememberSaveable { mutableStateOf("") }
    var tipResult by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(horizontal = 20.dp)
            .verticalScroll(rememberScrollState()),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )

        TextField(
            value = amountInput,
            onValueChange = { amountInput = it },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource( R.string.bill_amount)) },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
        )

        TextField(
            value = amountInput2,
            onValueChange = { amountInput2 = it },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(stringResource( R.string.tip_amountT)) },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                val amount = amountInput.toDoubleOrNull() ?: 0.0
                val tipPercent = amountInput2.toDoubleOrNull() ?: 0.0
                tipResult = calculateTip(amount, tipPercent)
            },
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC3ECD2))
        ) {
            Text(text = stringResource(R.string.calcTip), color = Color.Black)
        }

        Spacer(modifier = Modifier.height(24.dp))


        if (tipResult.isNotEmpty()) {
            Text(
                text = stringResource(R.string.tip_amount, tipResult),
                style = MaterialTheme.typography.displaySmall
            )
        }

    }
}


internal fun calculateTip(amount: Double, tipPercent: Double ): String {
    val tip = tipPercent / 100 * amount
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Preview(showBackground = true)
@Composable
fun TipCalculatorPreview() {
    Clase2503Theme {
        TipCalculator()
    }
}
