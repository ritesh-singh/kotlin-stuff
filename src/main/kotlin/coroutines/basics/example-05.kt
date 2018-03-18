package coroutines.basics

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * Co-routines are like daemon thread.
 *
 * Daemon thread - A thread that does not prevent JVM from exiting when the program finished but the thread is
 * still running.
 */

fun main(args: Array<String>) = runBlocking {
    launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // quit after delay
}