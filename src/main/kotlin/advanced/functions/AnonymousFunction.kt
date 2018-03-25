package advanced.functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    println(op(3, { it * it }))


    // Anonymous function
    // Can have multiple return types, unlike lambda
    println(op(4, fun(x): Int { return x * x }))
}