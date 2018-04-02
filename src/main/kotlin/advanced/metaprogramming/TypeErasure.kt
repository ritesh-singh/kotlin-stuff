package advanced.metaprogramming

/**
 * Type Erasure in Java
 *
 * Type Erasure is the technique using which the Java compiler translates generic / parameterized type
 * to raw type in Java generics. Type erasure is applicable in the context of generics.
 *
 * Why? Saves memory
 */


// Generics
fun <T> printList(list: List<T>) {
    if (list is List<*>) {
        println("This is a list")
    }
}

// Type Parameters
fun <T> printList(obj: T) {
    when (obj) {
        is Int -> println("This is an int")
        is String -> println("This is an string")
    }
}


// Refied generic support at run time for generics
inline fun <reified T> erased(input: List<Any>) {
    if (input is T) {

    }
}

inline fun <reified T> typeInfo() {
    println(T::class)
}


fun main(args: Array<String>) {
    val listStrings = listOf("One", "Two", "Three")
    val listNumbers = listOf(1, 2, 3)
}