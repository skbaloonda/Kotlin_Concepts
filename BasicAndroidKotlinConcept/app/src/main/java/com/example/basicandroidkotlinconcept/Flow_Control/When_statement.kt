package com.example.basicandroidkotlinconcept.Flow_Control

// when statement is similar to switch case in other programming languages
// It is used to execute a block of code based on the value of a variable or expression
// It is more powerful and flexible than switch case as it can evaluate any expression and not just constants

fun main() {
    val number = 3

    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("Unknown number")
    }

    // when can also be used as an expression
    val result = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Unknown number"
    }
    println("Result: $result")

    // when can also evaluate complex expressions
    val x = 10
    val y = 20
    when {
        x < y -> println("x is less than y")
        x > y -> println("x is greater than y")
        else -> println("x is equal to y")
    }



    //conditional statement using when
    var result1 = ""
    val number1 = 2345

    when(number%2){
        0 -> result1 = "Even Number"
        1 -> result1 = "Odd Number"
    }
    println("The number $number1 is an $result1")

    // multiple conditions in when statement
    val month ="January"
    when(month){
        "January","February","March" -> println("Q1")
        "April","May","June" -> println("Q2")
        "July","August","September" -> println("Q3")
        "October","November","December" -> println("Q4")
        else -> println("Invalid month")
    }

    // Capturing values in when statement
    val name ="Alice"
    when(val length = name.length){ // capturing length of name in length variable
        in 0..3 -> println("Short name") // length variable between 0 to 3
        in 4..7 -> println("Medium name")
        else -> println("Long name")
    }

}