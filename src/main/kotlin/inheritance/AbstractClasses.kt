package inheritance

// Abstract class, can have state
abstract class StoredEntity {
    var isActive = true
    abstract fun store()
    fun status() = isActive.toString()
}

class Employee : StoredEntity() {

    override fun store() {
        throw UnsupportedOperationException("Not implemented")
    }

}

fun main(args: Array<String>) {
    val employee = Employee()
    println(employee.isActive)
    println(employee.status())
}