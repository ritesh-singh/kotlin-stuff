package advanced.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var desc: String = "Default value") {
    fun validate() {
        if (amount > 10000) {
            println("advanced.metaprogramming.Transaction is too large")
        }
    }
}


// Using JavaAPI
fun interospectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }

}

fun getType(obj: Type){
    println(obj.typeName)
}

fun main(args: Array<String>) {
//    interospectInstance(Transaction(1, 200.0, "A simple transaction"))

    getType(Transaction::class.java)
}

