package advanced.functions

// https://kotlinlang.org/docs/reference/inline-functions.html

// In case of lambda, if it's not inlined, the non-local return won't work.

fun containingFunctionWithReturn() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            return // exist the function
        }
    }
    println("Hello!")
}

fun containingFunctionWithLocalReturn() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            return@forEach // exists lambda, can also use labels
        }
    }
    println("Hello!")
}

fun main(args: Array<String>) {
    containingFunctionWithReturn()
    println("---------------------------------------------------------")
    containingFunctionWithLocalReturn()
}