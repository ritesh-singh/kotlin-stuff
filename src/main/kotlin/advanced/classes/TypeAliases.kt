package advanced.classes

/**
 * From kotlin 1.1
 *
 * Give one type and Type-Alias
 */

typealias Name = String

typealias EmailData = String

class Employee(var name: Name, val email: EmailData) {
    fun printName(name: Name) {
        println(name)
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Alex","alex@gmail.com")
    employee.printName("Some Name")
}