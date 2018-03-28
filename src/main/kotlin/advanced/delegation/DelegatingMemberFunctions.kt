package advanced.delegation

import advanced.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}


interface Logger {
    fun logAll()
}

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