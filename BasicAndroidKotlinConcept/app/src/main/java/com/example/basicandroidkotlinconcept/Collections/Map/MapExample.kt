package com.example.basicandroidkotlinconcept.Collections.Map

// Map is a collection of key-value pairs where each key is unique and maps to a specific value.
// values can be duplicated but keys cannot be duplicated.

fun main() {
    // Creating a map, map is immutable by default
    val fruitsMap: Map<String, String> = mapOf(
        "A" to "Apple",
        "B" to "Banana",
        "C" to "Cherry"
    )

    val emptyMap = emptyMap<String, String>()// Creating an empty map
    println("Empty Map: $emptyMap") // Output: Empty Map: {}

    // Accessing values using keys
    val apple = fruitsMap["A"]
    println("Key A maps to value: $apple") // Output: Key A maps to value: Apple

    println(fruitsMap["D"]) // Output: null (key D does not exist)

    // Iterating over the map
    for ((key, value) in fruitsMap) {
        println("Key: $key, Value: $value")
    }

    // Checking if a key exists
    val hasKeyB = fruitsMap.containsKey("B")
    println("Map contains key B: $hasKeyB") // Output: Map contains key B: true

    // Checking if a value exists
    val hasValueMango = fruitsMap.containsValue("Mango")
    println("Map contains value Mango: $hasValueMango") // Output: Map contains value Mango: false

    // Getting all keys
    println(fruitsMap.keys)// Output: [A, B, C] : Set of keys

    // Getting all values
    println(fruitsMap.values) // Output: [Apple, Banana, Cherry] : Collection of values

}