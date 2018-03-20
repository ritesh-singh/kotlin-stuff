package classes

// Create an object without declaring a class, sometimes it is required to create an object
// with few properties, without needing a class


// Object declaration are lazy while expression are immediately

/**
 * An object declaration is not an expression,
 * and cannot be used on the right hand side of an assignment statement.
 *
 * Object declaration's initialization is thread-safe.
 *
 * - object expressions are executed (and initialized) immediately, where they are used;
 *
 * - object declarations are initialized lazily, when accessed for the first time;
 */


// Sigleton object declaration
object Global {
    val PI = 3.14                           // Object Declaration
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val PI = 3.142                     // Object Expression
    }

    println(localObject.PI)
}