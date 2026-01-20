package com.example.basicandroidkotlinconcept.Collections.Set

// A Set is a collection of unique elements. It does not allow duplicate values.

fun main() {
    // Creating a Set
    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5) // Duplicate '5' will be ignored

    // Displaying the Set
    println("Set: $numberSet") // Output: Set: [1, 2, 3, 4, 5]

    val emptySet = emptySet<String>()
    println("Empty Set: $emptySet") // Output: Empty Set: []

    val numbers = setOf(10, 20, 30, null, null) // Set can contain null values
    println("Set with nulls: $numbers") // Output: Set with nulls: [10, 20, 30, null]

    // Checking if an element exists in the Set
    val containsThree = numberSet.contains(3)
    println("Contains 3: $containsThree") // Output: Contains 3: true

    // Iterating through the Set
    for (number in numberSet) {
        println("Number: $number")
    }

    // Demonstrating immutability
    //numberSet.add(6) // This line would cause a compilation error since Sets are immutable by default

    // Creating a mutable Set
    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
    mutableNumberSet.add(4)
    println("Mutable Set after adding 4: $mutableNumberSet") // Output: Mutable Set after adding 4: [1, 2, 3, 4]
}