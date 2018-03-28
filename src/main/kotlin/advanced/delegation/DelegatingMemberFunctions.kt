package advanced.delegation

import advanced.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}


interface Logger {
    fun logAll()
}


// The by-clause indicates that repository will be stored internally in objects of
// Controller (Derived) and the compiler will generate all the methods of Base (Repository)
// that forward to repository.

// Note -> Override also works as expected
class Controller(repository: Repository, logger: Logger) : Repository by repository,
        Logger by logger {

//    fun indexWithoutDelegaion(): String {
//        return repository.getAll().toString() // without delegation
//    }


    fun indexWithDelegation(): String = getAll().toString()

    fun printLogAll() = logAll()

}

fun main(args: Array<String>) {

}