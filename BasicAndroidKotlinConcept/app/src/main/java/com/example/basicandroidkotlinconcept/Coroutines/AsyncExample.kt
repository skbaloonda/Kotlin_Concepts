package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

// async is a coroutine builder that is used to perform concurrent operations and return a result.
// It is similar to launch, but it returns a Deferred<T> object, which represents a future result of the computation.
// The Deferred<T> object can be awaited using the await() function, which suspends the coroutine until the result is available.

fun main (){
    runBlocking {

        val firstDeffered = async {
            getFirstValue()
        }
        val secondDeffered = async {
            getSecondValue()
        }
        println("Doing some other work while waiting for results...")
        delay(2000L)

        val sum = firstDeffered.await() + secondDeffered.await()
        println("Sum: $sum")
    }
}

suspend fun getFirstValue(): Int {
    delay(1000L)
    val value = Random.nextInt()
    println("First Value: $value")
    // Simulate a long-running operation
    return value
}

suspend fun getSecondValue(): Int {
    delay(3000L)
    val value = Random.nextInt()
    println("Second Value: $value")
    // Simulate a long-running operation
    return value
}

// In this example, we use async to launch two concurrent coroutines that fetch random integer values.
// While waiting for the results, we simulate doing some other work by delaying for 2 seconds.
// Finally, we use await() to get the results of both coroutines and calculate their sum.
// The output will show the first and second values fetched, along with the sum.