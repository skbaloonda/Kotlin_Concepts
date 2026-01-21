package com.example.basicandroidkotlinconcept.Expressions

// in keyword is used to check if a value is present in a collection or range.

fun main() {
    // Example with a list
    val numbers = listOf(1, 2, 3, 4, 5)
    val numberToCheck = 3

    if (numberToCheck in numbers) { // we can replace the numbers variable with listOf(1, 2, 3, 4, 5) directly
        println("$numberToCheck is present in the list.")
    } else {
        println("$numberToCheck is not present in the list.")
    }

    // Example with a range
    val range = 1..10
    val valueToCheck = 7

    if (valueToCheck in range) {// we can replace the range variable with 1..10 directly
        println("$valueToCheck is within the range.")
    } else {
        println("$valueToCheck is outside the range.")
    }

    // !in keyword example
    val charList = listOf('a', 'b', 'c', 'd')
    val charToCheck = 'e'
    if (charToCheck !in charList) { // we can replace the charList variable with listOf('a', 'b', 'c', 'd') directly
        println("$charToCheck is not present in the list.")
    } else {
        println("$charToCheck is present in the list.")
    }
}