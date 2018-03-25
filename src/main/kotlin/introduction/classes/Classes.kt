package introduction.classes

import java.util.*

class Customer {
    var id = 0
    var name: String = ""
}


// Here initId and initName is not property, but just the value being passed to the constructor
class Customer1(initId: Int, initName: String) {
    var id: Int = initId
    var name: String = initName
}


// Here id and name is property with it's accessors
class Customer2(var id: Int, var name: String)

// With default value and named argument
class Customer3(val id: Int, var name: String = "")

// With init block
class Customer4(val id: Int, var name: String) {
    init {
        name = name.toUpperCase()
    }
}


//Class with secondary constructor
class Customer5(id: Int, var name: String) {

    var email: String? = null

    init {
        name = name.toUpperCase()
    }

    // It is mandatory to delegate values to primary constructor
    constructor(id: Int, name: String, email: String) : this(id, name) {
        // This block is equivalent to init block of primary constructor
        this.email = email.toUpperCase()
    }
}


// With custom getter and setter
class Customer6(val id: Int, val name: String, val yearOfBirth:Int) {

    val abc:Int?=null

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth


    // Since, there is no field in kotlin, as accessor are created by default, the value is set by using
    // the backing field.
    var socialSecurityNumber:String = ""
        // value name can be anything
        set(value) {
            if (!value.startsWith("SN")){
                throw IllegalArgumentException("Social security number should start with SN")
            }
            field = value
        }
}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.id = 10
    customer.name = "John"

    val customer1 = Customer1(20, "Alex")

    val customer2 = Customer2(30, "Jake")
    println(customer2.id)
    println(customer2.name)

    println("-------------------------------------------------------------------------------")

    val customer3 = Customer3(10)
    println(customer3.id)
    println(customer3.name)

    println("-------------------------------------------------------------------------------")

    val customer3v1 = Customer3(name = "Max", id = 20)
    println(customer3v1.id)
    println(customer3v1.name)

    println("-------------------------------------------------------------------------------")

    val customer4 = Customer4(30, "Phillip")
    println(customer4.name)

    println("-------------------------------------------------------------------------------")

    // Secondary constructor

    val customer5 = Customer5(10, "John", "john@gmail.com")
    println(customer5.name)
    println(customer5.email)

    println()

    val customer5v1 = Customer5(20, "John-Mike")
    println(customer5v1.name)
    println(customer5v1.email)

    println("-------------------------------------------------------------------------------")

    // With custom getter and setter
    val customer6 = Customer6(10,"Mike",1992)
    println(customer6.id)
    println(customer6.name)
    println(customer6.age)
    customer6.socialSecurityNumber = "SN1234"
    println(customer6.socialSecurityNumber)

}