package advanced.classes

interface Repository {
    fun getAll():List<Customer>
}

class CustomController {
    lateinit var repository:Repository

    fun index():String{
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {
    val customController = CustomController()
    customController.index()
}