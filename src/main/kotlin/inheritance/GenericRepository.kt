package inheritance

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAlll(): List<T>
}

class MyRepo : Repo {
    override fun <T> getById(id: Int): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAlll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}