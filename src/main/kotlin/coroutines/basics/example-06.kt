package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Cancelling co-routines
 */

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting...")
    job.cancel() // cancels the job - we will not see any other output from other co-routines.
    job.join() // wait for jobs completion
    println("main: Now I can quit.")



}