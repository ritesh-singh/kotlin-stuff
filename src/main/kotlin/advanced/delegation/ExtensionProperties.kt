package advanced.delegation

/**
 * Extension properties can't have backing fields, so the initializer's
 * aren't allowed.
 *
 * Their behavior has to be defined explicitly.
 */

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}