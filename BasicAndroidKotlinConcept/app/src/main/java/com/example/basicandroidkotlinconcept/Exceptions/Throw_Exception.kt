package com.example.basicandroidkotlinconcept.Exceptions

fun  main () {
    // Throwing an exception manually using throw keyword

    val age = -5

    if (age < 0) {
        throw IllegalArgumentException("Age cannot be negative: $age")
    } else {
        println("Your age is $age")
    }
}