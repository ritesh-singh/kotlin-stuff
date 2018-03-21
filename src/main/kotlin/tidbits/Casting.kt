package tidbits


// Smart cast

// https://kotlinlang.org/docs/reference/typecasts.html

open class Person

class Employee : Person() {
    fun hasVacation(days: Int) {
        if (days < 60) {
            println("Need more vacation..!!")
        }
    }
}

class Contractor : Person() {

}

fun hasVacation(obj: Person) {
    if (obj is Employee) {
        obj.hasVacation(20) // Smart cast, after confirming is an employee
    } else {
        // hasVacation property won't show here
//        obj
    }
}

var input:Any = 10

// Smart cast - compiler does that for you

// Explicit cast - using 'as'

fun main(args: Array<String>) {

    // Explicit case

    val str = input as String // will throw an exception as integer can't be cast to string

    // safe-explicit case
    val safeStrCast = input as? String

    println(safeStrCast)
}