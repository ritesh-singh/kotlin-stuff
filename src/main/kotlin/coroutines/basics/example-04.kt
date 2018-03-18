package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

// Co-routine are light weight

/**
It launches 100K coroutines and, after a second, each coroutine prints a dot.
Now, try that with threads. What would happen? (Most likely your code will produce some sort
of out-of-memory error)
 **/

fun main(args: Array<String>) = runBlocking {
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}