package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

// withContext is a coroutine builder that is used to switch the context of a coroutine to a different dispatcher or thread pool.
// It is a suspending function that allows you to change the context of the coroutine for a specific block of code.

fun main (){
    runBlocking {
        launch(Dispatchers.Default) {

            println("First Context: ${coroutineContext}")

            withContext(Dispatchers.IO) {
                println("Switched Context to: ${coroutineContext}")
            }

            println("Back to First Context: ${coroutineContext}")
        }

    }
}

// In this example, we launch a coroutine in the Default dispatcher context.
// Inside this coroutine, we use withContext to switch to the IO dispatcher context for a specific block of code.
// After executing the block in the IO context, the coroutine automatically switches back to the Default context.
// The output will show the different coroutine contexts before, during, and after the withContext block.