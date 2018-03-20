package classes

// Data class to hold data

/**
 * Compiler automatically generates
 * 1.equals()/hashcode() pair
 * 2.toString()
 * 3.copy() function
 */

data class CustomerKotlin(var id: Int, var name: String, var email: String)

fun main(args: Array<String>) {
    val customerKotlin = CustomerKotlin(10, "Max", "max@gmail.com")

    // // run after adding and removing data keyword
    println(customerKotlin)

    // Copy function
    val customerKotlin1 = customerKotlin.copy()
    println(customerKotlin1)

    // Copy function
    val customerKotlin2 = customerKotlin.copy(email = "max@yahoo.com")
    println(customerKotlin2)
}