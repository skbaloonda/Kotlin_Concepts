package com.example.basicandroidkotlinconcept.Collections.Map

// Hashmap is a mutable collection that stores key-value pairs.

fun main(){
    val fruitsHashMap: HashMap<String, String> = hashMapOf(
        "A" to "Apple",
        "B" to "Banana",
        "C" to "Cherry"
    )

    println(fruitsHashMap)

    // Accessing values using keys
    fruitsHashMap.put("D", "Date") // Adding a new key-value pair
    println(fruitsHashMap)

    // Adding multiple key-value pairs
    fruitsHashMap.putAll(mapOf("E" to "Elderberry", "F" to "Fig")) // Adding multiple key-value pairs, adding a collection
    println(fruitsHashMap)

    // Removing a key-value pair
    fruitsHashMap.remove("B") // Removing a key-value pair by key
    println(fruitsHashMap)

    // Updating a value for a specific key
    fruitsHashMap.replace("C", "Citrus") // Replacing the value for a specific key
    println(fruitsHashMap)

    // Getting the size of the hashmap
    println(fruitsHashMap.size) // Output: 5

    // Checking if a key exists
    println(fruitsHashMap.containsKey("A")) // Output: true

    // Checking if a value exists
    println(fruitsHashMap.containsValue("Banana")) // Output: false

    println(fruitsHashMap.isNotEmpty())// Output: true
    println(fruitsHashMap.isEmpty()) // Output: false


    // Clearing the hashmap
    fruitsHashMap.clear()
    println(fruitsHashMap) // Output: {}
}