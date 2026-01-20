package com.example.basicandroidkotlinconcept.Collections.Set

fun main (){
    val numbers = hashSetOf(1, 2, 3, 4, 5, 5, null) // Duplicate '5' will be ignored
    val newNumbers = hashSetOf(4, 5, 6,9)

    //intersect function returns a set containing all elements that are common between two sets.
    println(numbers.intersect(newNumbers)) // Output: [4, 5]




}