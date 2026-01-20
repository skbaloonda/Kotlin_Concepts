package com.example.basicandroidkotlinconcept.Collections.List

// List is a collection which is ordered and allows duplicate elements.

fun main() {
    // Creating a List
    val fruits: List<String> = listOf("Apple", "Banana", "Orange", "Apple")// immutable list

    val fruits1 = listOf<String>() // Empty List

    val fruits2 = listOf("Apple",null,null) // List with null values

    println(fruits1)
    println(fruits2)

    // Accessing elements
    println("First fruit: ${fruits[0]}") // Output: First fruit: Apple // Accessing using index
    println("First fruit: ${fruits.get(1)}") // Output: First fruit: Banana // Accessing using get() method

    // Iterating through the List
    println("Fruits in the list:")
    for (fruit in fruits) { // in keyword to iterate through the list
        println(fruit)
    }

    // Checking size
    println("Total fruits: ${fruits.size}") // Output: Total fruits: 4

    // Checking if an element exists
    val hasBanana = "Banana" in fruits
    println("Contains Banana: $hasBanana") // Output: Contains Banana: true
}