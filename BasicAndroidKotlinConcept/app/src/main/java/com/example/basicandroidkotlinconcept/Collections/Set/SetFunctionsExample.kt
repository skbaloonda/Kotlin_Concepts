package com.example.basicandroidkotlinconcept.Collections.Set

fun main (){

    // Set Functions Example
    val numbers = setOf(1, 2, 3, 4, 5, 5, null) // Duplicate '5' will be ignored

    println(numbers.size)

    println(numbers.contains(5))
    println(numbers.contains(7))

    println(numbers.containsAll(setOf(4,6)))

    println(numbers.isEmpty())

    println(setOf<Int>().isEmpty())
    
}