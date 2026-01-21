package com.example.basicandroidkotlinconcept.Flow_Control

// while loop is used to execute a block of code repeatedly as long as a specified condition is true.
// The condition is checked before the execution of the loop's body.
fun main() {
    var i = 1
    while (i <= 5) {
        println("Iteration $i: Hello, World!")
        i++
    }

    // Example: Calculate the factorial of a number using while loop
    val number = 10
    var j =1
    var result =1

    while (j <= number) {
        result *= j
        j++
    }
    println("Factorial of $number is $result")


    // Do While Loop Example
    // do-while loop is similar to the while loop, but the condition is checked after the execution of the loop's body.
    // This guarantees that the loop's body is executed at least once, regardless of whether the condition is true or false.
    var k = 1
    do {
        println("Do-While Iteration $k: Hello, User!")
        k++
    } while (k <= 5)

    // nested while loop example
    var m = 1
    while (m <= 3) {
        var n = 1
        while (n <= 2) {
            println("Outer Loop Iteration $m, Inner Loop Iteration $n")
            n++
        }
        m++
    }

}