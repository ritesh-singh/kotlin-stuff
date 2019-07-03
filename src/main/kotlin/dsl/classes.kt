package dsl

import java.text.SimpleDateFormat
import java.util.*

data class Person1(var name: String? = null,
                   var age: Int? = null,
                   var address: Address1? = null)

data class Address1(var street: String? = null,
                    var number: Int? = null,
                    var city: String? = null)

fun person1(block: Person1.() -> Unit) = Person1().apply(block)

fun Person1.address1(block: Address1.() -> Unit) {
    address = Address1().apply(block)
}

fun main() {
    val person1 = person1 {
        name = "John"
        age = 25
        address1 {
            street = "Main Street"
            number = 42
            city = "London"
        }
    }
    println(person1)

    println("--------------------------------------")

    val person2 = person2 {
        name = "John"
        dateOfBirth = "1980-12-10"
        address {
            street = "Main street"
            number = 42
            city = "London"
        }
    }
    println(person2)
}


//----------------------------------------------------------------------

data class Person2(val name: String,
                   val dateOfBirth: Date,
                   val address2: Address2?)

data class Address2(val street: String,
                    val number: Int,
                    val city: String)

fun person2(block: PersonBuilder.() -> Unit): Person2 =
        PersonBuilder().apply(block).build()

class PersonBuilder {
    var name: String = ""
    private var dob: Date = Date()
    var dateOfBirth: String = ""
        set(value) {
            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
        }
    private var address: Address2? = null
    fun address(block: AddressBuilder.() -> Unit) {
        address = AddressBuilder().apply(block).build()
    }

    fun build(): Person2 = Person2(name, dob, address)
}

class AddressBuilder {
    var street: String = ""
    var number: Int = 0
    var city: String = ""

    fun build(): Address2 = Address2(street, number, city)
}