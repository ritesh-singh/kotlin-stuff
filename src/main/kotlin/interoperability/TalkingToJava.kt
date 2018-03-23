package interoperability

import classes.CustomerJava

fun main(args: Array<String>) {
    val customer = CustomerJava()

    // It's interoperable as in kotlin there are no fields but only properties, you can access java fields as properties
    customer.email = "david@gmail.com"

    customer.prettyPrint() // Give Unit, but java returns Unit -> Interoperable

    val runnable = Runnable { println("Invoking Runnable") }

    customer.neverNull()

    customer.someTimesNull()
}

// Interoperability with inheritance

class PersonKotlin : PersonJava() {

}

class KotlinCustomerRepo : CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        throw UnsupportedOperationException("Not Implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        throw UnsupportedOperationException("Not Implemented")
    }

}