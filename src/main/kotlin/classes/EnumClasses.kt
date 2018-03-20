package classes

// Basic use of enum classes, type-safe enums.

// Each enum constants are constants


// Enum declaration
enum class Priority {
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}


// Enum declaration with default values
enum class Priority1(val value:Int) {
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}

// Enum declaration with override and abstract functions
enum class Priority2(val value:Int){
    MINOR(-1){
        override fun text(): String {
            return "[Minor priority text]"
        }

        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            throw UnsupportedOperationException("Not implemented")
        }
    },
    MAJOR(1) {
        override fun text(): String {
            throw UnsupportedOperationException("Not implemented")
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            throw UnsupportedOperationException("Not implemented")
        }
    };


    abstract fun text():String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL

    println(priority)

    println("--------------------------")

    val priority1 =  Priority1.MINOR
    println(priority1)
    println(priority1.name)
    println(Priority1.CRITICAL.name)
    println(priority1.value)
    println(Priority1.CRITICAL.ordinal) // position

    println("*******************************")

    for (priorityInList in Priority1.values()){
        println(priorityInList)
    }

    println("*******************************")

    val p = Priority1.valueOf("MAJOR")
    println(p)
    println(p.ordinal)
    println(p.name)
    println(p.value)

    println("--------------------------")

    val priority2 = Priority2.MINOR
    println(priority2.text())


}