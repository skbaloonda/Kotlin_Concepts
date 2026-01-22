package com.example.basicandroidkotlinconcept.Functions

// Lambda Functions: Anonymous functions that can be treated as values and passed around.
// A lambda function can have parameters and a body, and it is defined using curly braces {}.
// A lambda function can be assigned to a variable, passed as an argument to other functions, or returned from functions.

fun main (){

    val myLambda:(String)->Unit = {name:String -> println("Hello, $name!")} // lambda function assigned to a variable
    myLambda("Sunil") // calling the lambda function

    // Lambda function that takes two integers and returns their sum
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    val result = sum(5, 10) // calling the lambda function
    println("Sum of 5 and 10 is: $result")

    // Lambda function that takes a string and returns its length
    val stringLength: (String) -> Int = { str -> str.length }
    val length = stringLength("Hello, Kotlin!")
    println("Length of the string is: $length")

}