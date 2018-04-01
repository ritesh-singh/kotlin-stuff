package advanced.generics

import advanced.classes.Customer

/**
 * Structure<T> is a covariant when
 *
 * Employee is a subtype of Person
 *          &
 * Structure<Person> is a subtype of Structure<Employee>
 *
 * Here, roles of persons and employees are changes, it not super-type from
 * sub-type.
 *
 *  - Values are passed in
 *  - Declaration site used to indicate
 *  - "in" modifier is used
 *  - similar to ? super T in java
 */


interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

