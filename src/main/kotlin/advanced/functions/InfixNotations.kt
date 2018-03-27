package advanced.functions

/**
 * In case of extension functions or member functions, that have single parameter, can be called using
 * infix notations.
 */


/**
 * It's much more readable a
 */

fun String.shouldBeEqualTo(value:String) = this == value

infix fun String.isMatching(value: String) = this == value

fun main(args: Array<String>) {

    println("Hello".shouldBeEqualTo("Hello"))

    println("Hello" isMatching "Hello")
}