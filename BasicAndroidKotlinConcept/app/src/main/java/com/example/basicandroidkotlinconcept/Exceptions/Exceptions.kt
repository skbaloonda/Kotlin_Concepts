package com.example.basicandroidkotlinconcept.Exceptions

fun main (){
    // An Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
    // The system can not recover from exceptions on its own, so we need to handle them using try-catch blocks.

    val number1 = 10
    val number2 = 0
    var result: Int
    //println (number1/number2) // This will throw an ArithmeticException: / by zero

    // Try catch finally block  -> to handle the exception
    try {
        result = number1 / number2 // This line throw an exception
        println("The result is: $result") // This line will not be executed as an exception occurred
    } catch (e: ArithmeticException) {
        println("Error: Division by zero is not allowed $$$  ${e.message}") // Handle the exception to avoid program crash
    } finally {
        println("Execution completed.") // This block will always be executed
    }
}