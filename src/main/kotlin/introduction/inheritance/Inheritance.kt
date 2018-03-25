package introduction.inheritance

open class Person {
    open fun validate() {

    }
}

open class Customer : Person {
    final override fun validate() {

    }

    constructor() : super()
}

class SpecialCustomer : Customer() {
//    override fun validate() {
//        super.validate()          // Doesn't allow as its final
//    }
}

fun main(args: Array<String>) {
    val customer = Customer()

    customer.validate()
}