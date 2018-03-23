@file:JvmName("UtilityClass")
package interoperability

// Top level functions - Place functions without having them wrap in the classes, just in a file

val copyRightYear = 2018

// const - Java can use it as a property
const val copyRightMonth = 1

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}