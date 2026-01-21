package com.example.basicandroidkotlinconcept.Flow_Control

// if -else Statement in Kotlin
// The if-else statement is used to execute a block of code based on a condition.
// If the condition is true, the code inside the if block is executed; otherwise, the code inside the else block is executed.
fun main() {
    val number = 10

    // Using if-else statement to check if the number is even or odd
    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }

    // if -else can also be used as an expression
    val result = if (number > 0) {
        "Positive Number"
    } else {
        "Negative Number or Zero"
    }
    println("The number is a $result.")

    // nested if-else statement
    val age = 25
    if (age < 18) {
        println("You are a minor.")
    } else {
        if (age in 18..65) {
            println("You are an adult.")
        } else {
            println("You are a senior citizen.")
        }
    }

    // else-if ladder
    val marks = 85
    if (marks >= 90) {
        println("Grade: A")
    } else if (marks >= 80) {
        println("Grade: B")
    } else if (marks >= 70) {
        println("Grade: C")
    } else if (marks >= 60) {
        println("Grade: D")
    } else {
        println("Grade: F")
    }

    // shorthand if -else
    val isEven = if (number % 2 == 0) true else false
    println("$number is even: $isEven")


}

