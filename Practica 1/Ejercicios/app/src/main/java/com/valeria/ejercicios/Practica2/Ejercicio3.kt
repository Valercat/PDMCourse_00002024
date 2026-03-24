package com.valeria.ejercicios.Practica2

fun main() {
    val tempC: Double = 27.0
    var FormCF: Double = (9/5)*(tempC) +32
    println(FormCF)
    printFinalTemperature(tempC, "Celcius", "Fahrenheit", {(9/5)*tempC})
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}