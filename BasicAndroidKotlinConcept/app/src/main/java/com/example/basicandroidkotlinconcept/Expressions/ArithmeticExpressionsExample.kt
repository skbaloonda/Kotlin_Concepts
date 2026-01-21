package com.example.basicandroidkotlinconcept.Expressions

// Arithmetic Expressions are used to perform mathematical operations like addition, subtraction, multiplication, division, and modulus.
// They are represented by operators such as +, -, *, /, and %.
fun main() {
    val a = 15
    val b = 4

    // Addition
    val sum = a + b
    println("Addition: $a + $b = $sum")

    // Subtraction
    val difference = a - b
    println("Subtraction: $a - $b = $difference")

    // Multiplication
    val product = a * b
    println("Multiplication: $a * $b = $product")

    // Division
    val quotient = a / b
    println("Division: $a / $b = $quotient")

    // Modulus
    val remainder = a % b
    println("Modulus: $a % $b = $remainder")


    // Demonstrating operator precedence
    val result = a + b * 2 - (a / b)
    println("Operator Precedence: $a + $b * 2 - ($a / $b) = $result") // Expected: 15 + 4 * 2 - (15 / 4) = 15 + 8 - 3 = 20

    // Complex Expression in if statement
    if(326/72*15+93%13==65){
        println("Expression is correct")
    } else {
        println("Expression is incorrect")
    }

    // Logical Expressions in if statement
    val x = 10
    val y = 20
    if (x < y && y > 15) { // && is the logical AND operator
        println("Both conditions are true")
    } else {
        println("One or both conditions are false")
    }

    // Logical operators are used to combine multiple boolean expressions.
    // Common logical operators include AND (&&), OR (||), and NOT (!).

}
