package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Suspend functions are a fundamental part of Kotlin's coroutines.
// They allow you to write asynchronous, non-blocking code in a sequential manner.
// A suspend function is marked with the suspend keyword and can only be called from within a coroutine or another suspend function.
// When a suspend function is called, it can suspend the execution of the coroutine without blocking the underlying thread.

var functionCall =0
fun main (){
    GlobalScope.launch {
        completeMessage()
    }

    GlobalScope.launch {
        improveMessage()
    }

    print("Hello, ")
    Thread.sleep(2000L)
    println("Total function calls: $functionCall")

}

suspend fun  completeMessage(){
    delay(500L)
    println("World!")
    functionCall++
}

suspend fun improveMessage(){
    delay(1000L)
    println("Kotlin Coroutines!")
    functionCall++
}

// In this example, we have two suspend functions: completeMessage() and improveMessage().
// Both functions use the delay() function to simulate a long-running operation.
// When we call these functions from within coroutines launched in the GlobalScope,
// the execution of the coroutines is suspended for the specified delay without blocking the main thread.
// After the delay, the functions print their respective messages.
// Finally, we print the total number of function calls made.
// This demonstrates how suspend functions can be used to perform asynchronous operations in a sequential manner,