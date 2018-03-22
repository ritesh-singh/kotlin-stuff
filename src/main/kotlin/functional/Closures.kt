package functional

//A lambda expression or anonymous function (as well as a local function and an object expression)
// can access
// its closure, i.e. the variables declared in the outer scope.

// Unlike Java, the variables captured in the closure can be modified.


fun outsideFunction() {
    val num = 10


    unaryOperation(20) { x ->
        x * num // can access, the variables declared in outer scope (Closure)
    }

    println("------------------------------------------")

    for (number in 1..100) {
        unaryOperation(1) { x ->
            println(number)
            x * number // variable captured is also being modified.
        }
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}

