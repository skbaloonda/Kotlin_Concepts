package com.example.basicandroidkotlinconcept.Collections

// Collections in Kotlin
/*
 A way to group multiple values into a single variable
* A way to store multiple values in a single variable

* Types of Collections:
    1. List: An ordered collection that allows duplicate elements
            : Elements can be accessed by their index/ position(index starts from 0)
    2. Set: An unordered collection that does not allow duplicate elements
            : We can not access elements by index/ position
            : We can go through the elements one by one using loops
            : example : a deck of cards, a collection of unique items
    3. Map: A collection of key-value pairs where each key is unique
            : Used to store data in key-value pairs
            : Values can be duplicated, but keys must be unique
            : Example: A dictionary where words are keys and their meanings are values

    4. Iterator: An object that allows you to traverse through a collection
            : Provides methods to iterate over elements one by one
            : Commonly used with loops to access each element in a collection

* Immutable vs Mutable Collections:
    - Immutable Collections: Cannot be modified after creation (read-only)
    - Mutable Collections: Can be modified after creation (add, remove, update elements)

* Example of Immutable List:
    val immutableList = listOf("Apple", "Banana", "Orange")
    println(immutableList)

* Example of Mutable List:
    val mutableList = mutableListOf("Apple", "Banana", "Orange")
    mutableList.add("Grapes")
    println(mutableList)


* */