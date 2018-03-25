package introduction.inheritance

// Contains declaration of abstract methods, as well as method implementation.

// What makes them different from abstract introduction.classes is that interfaces cannot store state.
// They can have properties but these need to be abstract or to provide accessor implementations.


// A property declared in an interface can either be abstract, or it can provide implementations
// for accessors.

// Properties declared in interfaces can't have backing fields,
// and therefore accessors declared in interfaces can't reference them.

interface CustomerRepository {
    val property: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer
}

interface EmployeeRepository {
    fun store(obj: Employee) {

    }

    fun getById(id: Int): Employee
}

class SqlCustomerRepository : CustomerRepository {
    override val property: Int = 29

    override fun getById(id: Int) = Customer()

}

interface interface1 {
    fun funA() {
        println("funA from interface 1")
    }
}

interface interface2 {
    fun funA() {
        println("funA from interface 2")
    }
}

class Class1And2 : interface1, interface2 {

//    override fun funA() {
//        println("Our Own")
//    }

    override fun funA() {
        super<interface2>.funA()
    }

}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA()
}
