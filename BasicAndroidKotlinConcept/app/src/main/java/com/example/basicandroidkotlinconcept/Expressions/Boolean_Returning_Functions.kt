package com.example.basicandroidkotlinconcept.Expressions

// Boolean returning functions are functions that return a value of type Boolean (true or false).

fun main () {

    val animals = arrayListOf<String>()

    // Demonstrating isEmpty() function which returns a boolean
    if (animals.isEmpty()) { // isEmpty() is a boolean returning function
        println("The list is empty.")
        animals.add("Dog")
    } else {
        println("The list is not empty.")
    }

    // Demonstrating contains() function which returns a boolean
    if (animals.contains("Dog")) { // contains() is a boolean returning function
        println("The list contains a Dog.")
    } else {
        println("The list does not contain a Dog.")
    }

    // Demonstrating add() function which returns a boolean
    if (animals.add("Cat")) { // add() is a boolean returning function
        println("Cat added to the list.")
    } else {
        println("Failed to add Cat to the list.")
    }


}