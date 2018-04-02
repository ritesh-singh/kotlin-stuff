package advanced.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
    /*println(Transaction::class) // This is a KClass -> Kotlin class

    println("----------------------------------")

    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class)*/

    // Create an instance using kotlin api

    val constructor = ::Transaction
    println(constructor)

//    val transaction = constructor.call(1,2000,"Some Desc")
//    println(transaction.desc)


    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction = constructor.callBy(mapOf(idParam to 1, amountParam to 2000))


    val trans = Transaction(1, 20.0 , "New Value")

    val nameProperty = Transaction::class.memberProperties.find { it.name == "description" }

    println(nameProperty?.get(trans))



}