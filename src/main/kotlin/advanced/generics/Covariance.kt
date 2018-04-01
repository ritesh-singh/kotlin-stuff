package advanced.generics

import advanced.classes.Customer

/**
 * List<T> is covariant when
 *
 * Employee is a subtype of Person
 *          &
 * List<Employee> is a subtype of List<Person>
 *
 * Means
 *
 * - Values are passed out, we are not modifying anything
 * - In kotlin, this is done using declaration-site to indicate covariance
 * - we use it via "out" modifier
 *
 * - It is similar to <? extends T> in Java
 *
 * In kotlin, list is co-variant, check out the implementation
 */


open class Person

class Employee : Person()

/**
 * List is co-variant, check out the implementation
 */
fun operate(person: List<Person>) {

}

// Co-variance, used for read only i.e only producing
interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Customer>()
    ro.getAll()
}