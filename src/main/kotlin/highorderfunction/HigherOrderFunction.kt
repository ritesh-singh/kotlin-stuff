package highorderfunction

fun main() {
    passMeAFunction {
        val a = 2
        println("print $a")
    }

    val add = returnMeAddFunction()
    println(add(1,2))
    println(returnMeAddFunction()(3,5))
}

// High order function, takes function as a parameter
fun passMeAFunction(abc: () -> Unit) {
    abc()
}

// High order function, returns a function
fun returnMeAddFunction(): (Int, Int) -> Int {

    // ::add converted add function to lambda function
    return ::add
}

fun add(a: Int, b: Int): Int {
    return a + b
}