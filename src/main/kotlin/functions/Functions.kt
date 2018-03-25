package functions

fun hello(): Unit {
    println("Hello World!")
}

fun throwsException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsSomeInt(): Int {
    return 6
}

fun returnSomeInt() = 6 // Type inference and single line statement so no return and block required

fun takeString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum1(x: Int, y: Int) = x + y // Type inference as compile knows both x and y are int's and single line as it's a single statement

// Default parameters in functions

fun sumWithDefault(x: Int, y: Int, z: Int = 0) = x + y + z

// Named parameters
fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

// Function with unlimited or unknown parameters
fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}


/**
 * Here * is spread operator, spread operator is used here to put an array
 * into a vararg parameter
 */

/**
 * When we call a vararg-function, we can pass arguments one-by-one, e.g. asList(1, 2, 3), or,
 * if we already have an array and want to pass its contents to the function,
 * we use the spread operator (prefix the array with *):
 */
fun printStringsAgain(vararg strings: String) {
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
//    throwsException()
    println(returnsSomeInt())
    println(returnSomeInt())
    takeString("Functions")
    println(sum(1, 2))
    println(sum1(3, 4))

    println("------------------------------------------------------------------------------------------------------------------------------")
    println(sumWithDefault(1, 2, 3))
    println(sumWithDefault(1, 2))

    //Named parameters
    printDetails("Jake", phone = "1234567890")

    //Calling unlimited or unknown parameters
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")

    println("------------------------------------------------------------------------------")

    printStringsAgain("1")
    printStringsAgain("1", "2", "3")
    printStringsAgain("1", "2", "3", "4")
}