package com.example.basicandroidkotlinconcept.Collections.Set

// A Hashset is a mutable set collection that stores unique elements in no particular order.

fun main (){
    // Creating a HashSet
    val hashSet: HashSet<String> = hashSetOf("Apple", "Banana", "Orange", "Apple") // Duplicate 'Apple' will be ignored

    // Displaying the HashSet
    println("HashSet: $hashSet") // Output: HashSet: [Apple, Banana, Orange]

    // Adding elements to the HashSet
    hashSet.add("Grapes")
    println("HashSet after adding Grapes: $hashSet") // Output: HashSet after adding Grapes: [Apple, Banana, Orange, Grapes]

    // Adding a collection to the HashSet
    val moreFrutis = setOf("Mango", "Pineapple", "Banana") // 'Banana' is a duplicate
    hashSet.addAll(moreFrutis)
    println("HashSet after adding more fruits: $hashSet") // Output: HashSet after adding more fruits: [Apple, Banana, Orange, Grapes, Mango, Pineapple]

    // Removing an element from the HashSet
    hashSet.remove("Banana")
    println("HashSet after removing Banana: $hashSet") // Output: HashSet after removing Banana: [Apple, Orange, Grapes]

    // Checking if an element exists in the HashSet
    val containsOrange = hashSet.contains("Orange")
    println("Contains Orange: $containsOrange") // Output: Contains Orange: true

    // Iterating through the HashSet
    for (fruit in hashSet) {
        println("Fruit: $fruit")
    }

    // Removing multiple elements from the HashSet
    val toRemove = setOf("Apple", "Grapes")
    hashSet.removeAll(toRemove)// Removing multiple elements
    println("HashSet after removing multiple elements: $hashSet") // Output: HashSet after removing multiple elements: [Orange, Mango, Pineapple]
}