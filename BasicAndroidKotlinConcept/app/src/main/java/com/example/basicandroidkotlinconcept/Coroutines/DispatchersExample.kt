package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

// Dispatchers in Kotlin Coroutines are used to determine the thread on which a coroutine will run.
// They help manage concurrency and ensure that tasks are executed on the appropriate threads based on their nature (e.g., CPU-bound, IO-bound, or main thread operations).
// Main Dispatchers: This dispatcher is used for tasks that need to run on the main thread, such as updating the UI in Android applications.
// IO Dispatchers: This dispatcher is optimized for IO-bound tasks, such as network requests or file operations. It uses a shared pool of threads to handle multiple IO operations concurrently.
// Default Dispatchers: This dispatcher is designed for CPU-bound tasks that require intensive computation. It uses a shared pool of threads based on the number of available CPU cores.
// Unconfined Dispatchers: This dispatcher starts the coroutine in the current thread but can resume it in a different thread. It is generally used for coroutines that do not have specific thread requirements.
// newSingleThreadContext("MyThread"): This dispatcher creates a new thread for the coroutine, which can be useful for tasks that require isolation from other threads.
fun main (){

    runBlocking {
        /*launch(Dispatchers.Main) {
            println("Running on Main Dispatcher: ${Thread.currentThread().name}")
        }*/

        launch(Dispatchers.Unconfined) {
            println("Running on Unconfined1 Dispatcher: ${Thread.currentThread().name}")
            delay(100L)
            println("Running on Unconfined2 Dispatcher: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Running on Default Dispatcher: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("Running on IO Dispatcher: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("Running on newSingleThreadContext: ${Thread.currentThread().name}")
        }
    }
}

// In this example, we launch several coroutines using different dispatchers.
// Each coroutine prints the name of the thread it is running on.
// The output will show how different dispatchers utilize different threads for executing coroutines.
// Note: The Main dispatcher requires a proper main thread environment (like Android or JavaFX) to work correctly.
// The Unconfined dispatcher starts in the current thread but may resume in a different thread after suspension.
