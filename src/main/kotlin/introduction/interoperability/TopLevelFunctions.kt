@file:JvmName("UtilityClass")
package introduction.interoperability

// Top level introduction.functions - Place introduction.functions without having them wrap in the introduction.classes, just in a file

val copyRightYear = 2018

// const - Java can use it as a property
const val copyRightMonth = 1

fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}