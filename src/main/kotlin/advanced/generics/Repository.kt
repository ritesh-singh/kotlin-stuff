package advanced.generics

import java.io.Serializable

// By default the restriction is
// Any?

// Upper Bound Restriction on Generics

open class Entity(val id: Int)


// Upper bound with one restriction
class Repository<T : advanced.generics.Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // ....
        }
    }
}

// Upper bound with many restrictions
class Database<T> where T : advanced.generics.Entity, T : Serializable {
    fun save(entity: T) {
        if (entity.id != 0) {
            // ....
        }
    }
}

// Function with upper bound restriction
fun <T : Serializable> streamObject(obj: T) {

}

class CustomerEntity(id: Int) : advanced.generics.Entity(id) {

}

fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity>()
}