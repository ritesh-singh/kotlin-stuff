package advanced.classes

// Like static in java

// Each class can have single companion object

// Also, check NestedClass.java for interop

class Log() {

    companion object {
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

    constructor(filename: String) : this()

}

fun main(args: Array<String>) {
    val log = Log.createFileLog("aa")

}