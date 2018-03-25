package advanced.functions

// A function inside an function, use-case would be grouping the related code in an function.

fun foo(fooParam: String) {
    val outerFunction = "value"
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }

    bar("Bar value")
}

fun main(args: Array<String>) {
    foo("Some value")
}