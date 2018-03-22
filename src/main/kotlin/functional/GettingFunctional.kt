package functional

// High order function

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {

    // :: this sign is used to reference a function
    operation(1, 2, ::sum)


}