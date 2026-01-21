package com.example.basicandroidkotlinconcept.Flow_Control

// Break keyword is used to exit from the loop or switch statement prematurely.
// Continue keyword is used to skip the current iteration of a loop and move to the next iteration.

fun main() {
    // Break Statement Example
    for (i in 1..10) {
        if (i == 6) {
            println("Breaking the loop at i = $i")
            break // Exit the loop when i is 6
        }
        println("Current value of i: $i")
    }

    println() // Just for better readability in output

    // Continue Statement Example
    for (j in 1..10) {
        if (j % 2 == 0) {
            println("Skipping even number j = $j")
            continue // Skip the rest of the loop body for even numbers
        }
        println("Current odd value of j: $j")
    }

    // label is used with break and continue to specify which loop to affect in nested loops
    // example of labeled break and continue
    outerLoop@ for (m in 1..3) {
        innerLoop@ for (n in 1..3) {
            if (m == 2 && n == 2) {
                println("Breaking out of outer loop at m = $m, n = $n")
                break@outerLoop // Breaks out of the outer loop
            }
            if (n == 2) {
                println("Continuing inner loop at m = $m, n = $n")
                continue@innerLoop // Continues to the next iteration of the inner loop
            }
            println("Current values: m = $m, n = $n")
        }
    }
}
