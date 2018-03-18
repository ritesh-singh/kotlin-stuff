package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Co-routines are light-weight threads.No involvement of context-switching by OS and not extra
 * memory head.
 */

fun main(args: Array<String>) {
    launch {
        // launch new co-routine in background and continue
        delay(1000L) // non-blocking delay for 1 second
        println("World") // run after delay
    }
    println("Hello,")
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}

fun main1(args: Array<String>) {
    launch {
        delay(1000L)
        println("World")
    }
    println("Hello,")
    runBlocking {
        // blocks the main thread
        delay(2000L) // delay for 2 seconds to keep JVM alive
    }
}

fun main2(args: Array<String>) = runBlocking<Unit> { // Start main co-routine
    launch {
        // launch new co-routine in background and continue
        delay(1000L)
        println("World")
    }
    println("Hello,") //main co-routine continues here immediately
    delay(2000L) // delay for 2 seconds to keep JVM alive
}