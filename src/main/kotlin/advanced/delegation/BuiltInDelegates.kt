package advanced.delegation

import kotlin.properties.Delegates

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {

    var department: String by Delegates.observable("",
            { property, oldValue, newValue ->
                println("Property ${property.name} has changed from $oldValue to $newValue")
            })


    fun printName(string: String) {

    }
}


class Veto {
    var value: String by Delegates.vetoable("String") { prop, oldVal, newVal ->
        newVal.startsWith("S")
    }
}


fun main(args: Array<String>) {
    val employee = Employee("Alex", "alex@gmail.com")
    employee.printName("A String")

    employee.department = "IT"

    println("--------------------------------------")

    val veto = Veto()
    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}