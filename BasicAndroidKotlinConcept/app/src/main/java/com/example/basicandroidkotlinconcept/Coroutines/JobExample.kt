package com.example.basicandroidkotlinconcept.Coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Job in Kotlin Coroutines represents a cancellable task.
// It is a handle to a coroutine and can be used to manage its lifecycle.
// A Job can be in one of the following states: Active, Completed, or Cancelled.
// You can create a Job using the launch or async coroutine builders.
// You can cancel a Job using the cancel() function, which will stop the coroutine's execution.
// if we cancel a job, then all child jobs will also get cancelled.

fun main (){
    runBlocking {
        val job1 = launch {
            //delay(3000L)
            println("Job 1 started")

            val job2 = launch {
                delay(1000L)
                println("Job 2 started")
                delay(2000L)
                println("Job 2 completed")
            }
            job2.invokeOnCompletion {
                println("Job 2 completed")
            }

            val job3 = launch {
                println("Job 3 started")
                delay(1500L)
                println("Job 3 completed")
            }

            job3.invokeOnCompletion {
                println("Job 3 completed")
            }
        }

        job1.invokeOnCompletion {
            println("Job 1 completed")
        }
        delay(500L)
        println("Job 1 will be cancelled")
        job1.cancel()
    }
}

// In this example, we create a parent job (job1) that launches two child jobs (job2 and job3).
// We use the invokeOnCompletion function to register a callback that will be called when each job completes.
// After a short delay, we cancel the parent job (job1), which also cancels its child jobs (job2 and job3).
// The output will show the start of each job, followed by the cancellation messages.