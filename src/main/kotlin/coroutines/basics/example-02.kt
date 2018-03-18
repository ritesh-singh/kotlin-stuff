package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

// Waiting for a job

/**
 * Delaying for a time while, another co-routine is working is not a good approach.
 */

fun main(args:Array<String>) = runBlocking{
    val job  = launch { // launch new co-routine and keep a reference to its job
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child co-routine completes
}