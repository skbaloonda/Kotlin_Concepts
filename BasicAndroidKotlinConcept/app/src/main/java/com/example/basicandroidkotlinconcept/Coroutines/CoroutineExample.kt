package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Coroutinnes are light-weight threads used for asynchronous programming in Kotlin.
// They allow you to write non-blocking code that is easier to read and maintain.
// Coroutines are built on top of regular threads but are more efficient in terms of resource usage.
// They can be suspended and resumed without blocking the underlying thread, making them ideal for tasks like network requests, database operations, and UI updates.

fun main () {
    /*GlobalScope.launch { // launch a new coroutine in background and continue
       delay(1000L)
         println("Coroutines Example")
    }
    print("Hello,")
    Thread.sleep(4000L) // Keep JVM alive*/



// GlobalScope: This is a global coroutine scope that is not tied to any specific lifecycle.
// Coroutines launched in this scope will run until the application is terminated.
// launch: This function is used to start a new coroutine. It takes a block of code as its parameter.
// runBlocking: This function is used to block the current thread until the coroutine inside it completes.
// delay: This is a suspending function that pauses the coroutine for a specified amount of time without blocking the underlying thread.
// coroutineScope{}: This function creates a new coroutine scope and allows you to launch new coroutines within it. It suspends until all launched children complete.
// Thread.sleep(): This is a standard Java function that blocks the current thread for a specified amount of time. It is used here to keep the JVM alive long enough for the coroutine to complete.

/*
    println("Program execution will now block")

    runBlocking {
        launch {
            delay(1000L)
            println("runBlocking Coroutines ")
        }


        GlobalScope.launch {
            delay(500L)
            println("GlobalScope Coroutines ")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("coroutineScope Coroutines ")
            }
        }
    }
    println("Program execution will now continue")*/


    //Coroutine Context :
    //Coroutine context is a set of elements that define the behavior of a coroutine.
    // It includes information such as the dispatcher to be used, job hierarchy, and any additional data.
    // Dispatcher : which thread or threads the coroutine will run on (e.g., Main, IO, Default).
    // Job : represents the lifecycle of the coroutine and can be used to cancel it.

    runBlocking {
        launch(CoroutineName("MyCoroutine")) {

            println("This is run from ${coroutineContext.get(CoroutineName.Key)}")

        }
    }
}

