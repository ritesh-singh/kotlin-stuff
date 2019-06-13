package lambda

fun main() {
    println(square(3))
}

// Lambda expression

val square: (Int) -> Int = { it -> it * it }

// This is a lambda expression which does nothing.

// { value -> value } is a complete function in itself.
// It takes int as a parameter and returns a value as an int.
val doNothing: (Int) -> Int = { value -> value }