package classes

import java.io.IOException

// Data class to hold data

/**
 * Compiler automatically generates
 * 1.equals()/hashcode() pair
 * 2.toString()
 * 3.copy() function
 */

data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    // Interoperability

    // Doesn't impact anything when kotlin to kotlin talk, however it does
    // @JvmField - allows java to access it as a property instead of as field (getter and setter)
    @JvmField
    val somProperty = "value"

    override fun toString(): String {
        return super.toString()
    }

    // Interoperability
    //  @JvmOverloads -  For, default param to work in java
    @JvmOverloads
    fun changeStatus(status: Status = Status.Current) {

    }

    // @JvmName -  Allows, to change name, when called from java
    @JvmName("preferential")
    fun makePreferred() {

    }

    // @Throws - To throw checked exception when called from java, as kotlin
    // doesn't have the concept of checked exception
    @Throws(IOException::class)
    fun loadStatistics(fileName: String) {
        if (fileName == "") {
            throw IOException("File name cannot be blank")
        }
    }
}

enum class Status {
    Current,
    Past
}

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