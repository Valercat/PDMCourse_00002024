package com.valeria.ejercicios.Practica2

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if(age>-1) {
        if(age<=12){
            return 15
        }
        else if(age >=13 && age <= 60){
            return if(isMonday){
                25
            } else {
                30
            }
        }
        else if(age in 61..100){
            return 20
        }
    }
    else{
        println("Wrong age typed")
        return 0
    }
    return 0
}