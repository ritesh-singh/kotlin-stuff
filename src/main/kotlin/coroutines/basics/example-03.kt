package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

// Extract function refactoring

/**
Extract block of code from launch and make it a separate function and call it from launch
 **/

fun main(args: Array<String>) = runBlocking {
    val job = launch { doWorld() }
    println("Hello,")
    job.join()
}

// suspending functions are used inside co-routine and use other suspending functions
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}