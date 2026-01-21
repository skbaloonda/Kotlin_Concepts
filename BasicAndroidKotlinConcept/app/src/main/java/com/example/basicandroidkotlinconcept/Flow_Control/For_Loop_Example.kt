package com.example.basicandroidkotlinconcept.Flow_Control

// For loop is used to iterate over a range, array, or collection.
// It executes a block of code for each item in the specified range or collection.
// nested for loops are also supported.
fun main() {
    // Example 1: Iterating over a range
    println("Iterating over a range:")
    for (i in 1..5) {
        println("Number: $i")
    }

    // Example 2: Iterating over an array
    println("\nIterating over an array:")
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }

    // Example 3: Nested for loop
    println("\nNested for loop:")
    for (i in 1..3) {
        for (j in 1..2) {
            println("i: $i, j: $j")
        }
    }

    // Additional Examples:
    for (i in 1..10 step 2){
        println("Odd Number: $i")
    }

    // Countdown from 10 to 1
    for (i in 10 downTo 1){
        println("Countdown: $i")
    }

    // Even numbers countdown
    for (i in 10 downTo 1 step 2){
        println("Even Countdown: $i")
    }

    // Iterating over characters
    for (i in 'A'..'E'){
        println("Character: $i")
    }

    for(i in 1..12){
        val month = when(i){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            else ->" August to December"
        }
        println("Month $i : $month")
    }

    // iterating over a hashmap
    val countryCapitalMap = mapOf("USA" to "Washington, D.C.", "France" to "Paris", "Japan" to "Tokyo")
    for ((country, capital) in countryCapitalMap) {
        println("The capital of $country is $capital")
    }

    for (countryName in countryCapitalMap.keys){
        println("Country Name: $countryName")
    }

    // Nested for loop to print a triangle pattern of emojis
    for(i in 1..10){
        for (j in 1..i){
            print("\uD83D\uDE00")

        }
        println()
    }



    // Nested for loop to print a matrix with diagonal elements labeled
    val matrixSize = 9
    for (i in 0..matrixSize){
        for (j in 0..matrixSize){
            if (i==j){
                print("diagonal \t")
            } else{
                print("$i, $j  \t\t")
            }
        }
        println()

    }

    println("Please enter the matrix size")
    val input = readLine()?:""
    val size = input.toInt()

    for(i in 1..size){
        for (j in 1..size){
            when(i*j%3){
                0 -> print("\uD83D\uDE00")
                1 -> print("\uD83D\uDE03")
                2 -> print("\uD83D\uDE31")
            }
        }
        println()
    }


}