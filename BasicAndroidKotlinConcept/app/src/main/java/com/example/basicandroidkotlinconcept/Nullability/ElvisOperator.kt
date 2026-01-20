package com.example.basicandroidkotlinconcept.Nullability

fun main(){
    val name: String? = null

    // Using Elvis operator(?:) to provide a default value if name is null
    val displayName = name ?: "Guest User"

    println("Hello, $displayName") // Output: Hello, Guest User

}