package com.example.basicandroidkotlinconcept.Collections.List

// ArrayList is a mutable collection which means we can add, remove or update elements after its creation.

fun main() {
    // Creating an ArrayList
    val fruits: ArrayList<String> = arrayListOf("Apple", "Banana", "Orange") // mutable list

    val fruits1 = ArrayList<String>() // Empty ArrayList

    val fruits2 = arrayListOf<String?>(null, null) // ArrayList with null values

    println(fruits1)
    println(fruits2)

    // Accessing elements
    println("First fruit: ${fruits[0]}") // Output: First fruit: Apple // Accessing using index
    println("First fruit: ${fruits.get(0)}") // Output: First fruit: Apple // Accessing using get() method

    // Iterating through the ArrayList
    println("Fruits in the list:")
    for (fruit in fruits) { // in keyword to iterate through the list
        println(fruit)
    }

    // Checking size
    println("Total fruits: ${fruits.size}") // Output: Total fruits: 3

    // Checking if an element exists
    val hasBanana = "Banana" in fruits
    println("Contains Banana: $hasBanana") // Output: Contains Banana: true

    // Adding elements
    fruits.add("Grapes")
    println("After adding Grapes: $fruits")

    // Removing elements
    fruits.remove("Apple")
    println("After removing Apple: $fruits")

    // Updating elements
    fruits[0] = "Mango"
    println("After updating first element to Mango: $fruits")


    val moreFruits = arrayListOf("Pineapple", "Kiwi")

    fruits.addAll(moreFruits) //adding another collection

    println("After adding more fruits: $fruits")

    fruits.removeAll(moreFruits) //removing another collection

    println("After removing more fruits: $fruits")

    fruits.add("Orange") //adding duplicate element

    println("After adding duplicate Orange: $fruits")

    fruits.remove("Orange") //removes first occurrence of Orange
    println("After removing first occurrence of Orange: $fruits")
}