package coroutines.basics

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Async-style functions
 */

// The result type of somethingUsefulOneAsync is Deferred<Int>
fun somethingUsefulOneAsync() = async {
    doSomethingUsefulOne()
}

fun somethingUsefulTwoAsync() = async {
    doSomethingUsefulTwo()
}


fun main(args: Array<String>) {
    val time = measureTimeMillis {
        // we can initiate async actions outside of a coroutine
        val one = somethingUsefulOneAsync()
        val two = somethingUsefulTwoAsync()

        // but waiting for a result must involve either suspending or blocking.
        // here we use `runBlocking { ... }` to block the main thread while waiting for the result
        runBlocking {
            println("The answer is ${one.await() + two.await()}")
        }
    }

    println("Completed in $time ms")
}