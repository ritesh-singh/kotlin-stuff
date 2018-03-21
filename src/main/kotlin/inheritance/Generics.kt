package inheritance

interface Repository<T> {
    fun getById(id: Int): T

    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val customer: Customer = customerRepo.getById(1)

    val employeeRepo = GenericRepository<Employee>()
    val employee = employeeRepo.getById(2)
}