package functional

import javax.rmi.CORBA.Util

// High order function

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun sum(x: Int, y: Int) = x + y


fun unaryOperation(x: Int, op: (Int) -> Int) {
    println(op(x))
}

fun unaryOp(op: (Int) -> Int) {

}


fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {

    // :: this sign is used to reference a function
    operation(1, 2, ::sum)

    println("------------------------------------------")

    // Using lambda in high order functions

    operation(2, 3, { x: Int, y: Int -> x + y })

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(5, 6, sumLambda)


    unaryOperation(5, { x -> x * x })

    // If lambda func has single param, the param can be referenced as 'it'
    // x-> can be avoided here, as lambda has single parameter
    unaryOperation(6, { it * it })

    // If last parameter is a high order function, it can be taken out, outside
    // the bracket
    unaryOperation(7) { it * it }

    unaryOp {
        it * it
    }

    val db = Database()

    transaction(db) {
        // interact with the database
    }


    // Anonymous function - a function with no name
    unaryOperation(3, fun(x: Int): Int { return x * x })

}