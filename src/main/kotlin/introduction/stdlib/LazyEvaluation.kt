package introduction.stdlib

fun main(args: Array<String>) {
    val elements = 1..10000000000


    // asSequence() - converts collection into an lazy collection

    /*val output = elements.asSequence().filter { it < 30 }
            .map { Pair("Yes", it) }

    output.forEach {
        println(it)
    }*/

    val output = elements.asSequence().take(30).sum()
    println(output)

    val numbers = generateSequence(1) { x ->
        x + 10
    }

    println(numbers.take(30).sum())


    // Won't be initialized when code is run, from top to down, only when it is called
    val lazyInit: Int by lazy { 10 }
}