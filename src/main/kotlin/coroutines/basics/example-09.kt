package coroutines.basics

import kotlinx.coroutines.experimental.CoroutineStart
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Lazily started async
 *
 * There is a laziness option to async using an optional start parameter with a value of
 * CoroutineStart.LAZY.
 * It starts coroutine only when its result is needed by some await or if a start function is invoked.
 *
 *
 * So, we are back to sequential execution, because we first start and await for one,
 * and then start and await for two. It is not the intended use-case for laziness.
 * It is designed as a replacement for the standard
 * lazy function in cases when computation of the value involves suspending functions.
 *
 */

fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}