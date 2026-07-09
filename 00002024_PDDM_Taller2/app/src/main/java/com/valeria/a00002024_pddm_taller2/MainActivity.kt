package com.valeria.a00002024_pddm_taller2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.valeria.a00002024_pddm_taller2.ui.theme._00002024_PDDM_Taller2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _00002024_PDDM_Taller2Theme() {
            AppFoodSpot()
            }
        }
    }
}