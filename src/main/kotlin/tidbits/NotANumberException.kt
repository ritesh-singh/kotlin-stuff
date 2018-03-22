package tidbits

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * CheckException Java - A checked exception is a type of exception that must be
 * either caught or declared in the method in which it is throw.
 *
 * An exception is a checked exception if it inherits from java.lang.Throwable,
 * but not from java.lang.RuntimeException or java.lang.Error.
 *
 *
 * https://kotlinlang.org/docs/reference/exceptions.html
 */


/**
 * All exceptions are descendants of class Throwable.
 * There are no checked exception in kotlin.
 *
 * Exceptions are expression in kotlin.
 */


class NotANumberException(message: String) : Throwable(message)


fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Double, Float -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {

    /*try {
        checkIsNumber("A")
    } catch (e: IllegalArgumentException) {
        println("Do Nothing!")
    } catch (e: NotANumberException) {
        println(e.message)
    }*/


    val buffer = BufferedReader(FileReader(File("input.txt")))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    } finally {
        println("Closing")
        buffer.close()

    }
    println(result)
}