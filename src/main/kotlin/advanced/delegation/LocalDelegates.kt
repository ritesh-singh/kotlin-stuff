package advanced.delegation

/**
 * https://kotlinlang.org/docs/reference/delegated-properties.html
 */


fun localDelegatedProperties() {

    // By default synchronized, the first call to get() executes the lambda passed
    // to lazy() and remembers the result, subsequent calls to get() simply
    // return the remembered result.

    val lazy by lazy {
        initLate()
    }

    val lazyValue: String by lazy {
        println("Computed")
        "Hello"
    }
}

fun initLate(): String = "initLate"

fun main(args: Array<String>) {

}