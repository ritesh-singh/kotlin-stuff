package functional

// Extensions are statically resolved.

// Extensions do not actually modify classes they extend.

fun String.hello() {
    println("It's me")
}


fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}

fun main(args: Array<String>) {
    "Hello".hello()
    println("this is a sample string to Title Case it".toTitleCase("Again"))

    println("-----------------------------------")

    val customer = Customer()
    customer.makePreferred()

    customer.makePreferred("My new version")

    val instance = InheritedClass()

    instance.extension()

}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred(message: String) {
    println(message)
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}