package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main (){
    runBlocking {
        val myHandler = CoroutineExceptionHandler{coroutineContext, throwable ->
            println("Exception Handled ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("Index out of bound exception thrown")

        }

        job.join()

        val deffered = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Arithmetic Exception thrown")
        }

        try {
            deffered.await()
        } catch (e: ArithmeticException){
            println("Exception Handled in async ${e.localizedMessage}")
        }

    }
}

// Exception Handling in Coroutines
// In coroutines, exceptions can be handled using CoroutineExceptionHandler for launch coroutines
// and try-catch blocks for async coroutines. CoroutineExceptionHandler allows you to define
// a handler that will be invoked when an uncaught exception occurs in a coroutine.
// In the case of async coroutines, since they return a Deferred result, exceptions are propagated
// when you call await() on the Deferred object. Therefore, you can use try-catch blocks
// around the await() call to handle exceptions.