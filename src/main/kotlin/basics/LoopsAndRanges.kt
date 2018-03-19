package basics

fun main(args: Array<String>) {

    for (a in 1..100) {
        println(a)
    }

    println("*********************************************************************")

    val numbers = 1..100 // .. is an operator overload for rangeTo, which creates a range to the specified value.
    for (a in numbers) {
        println(a)
    }

    println("--------------------------------------------------------------------------")

    // Reverse
    for (a in 100 downTo 1) {
        println(a)
    }

    println("*********************************************************************")

    for (a in 100..1) {
        println(a)
    }

    println("--------------------------------------------------------------------------")

    // Step

    for (a in 1..100 step 5) {
        println(a)
    }


    println("--------------------------------------------------------------------------")

    // List
    val lists = listOf("A", "B", "C", "D")
    for (value in lists) {
        println(value)
    }

    println("--------------------------------------------------------------------------")

    // While and do-while

    var i = 10
    while (i > 0) {
        i--
        println(i)
    }

    i = 10
    do {
        i--
    } while (i > 0)


    println("--------------------------------------------------------------------------")

    // Break and continue
    for (i in 1..10) {
        if (i == 5)
            break
        println(i)
    }

    println("****************")

    for (i in 1..10) {
        print("i -> $i")
        for (j in 1..5) {
            if (j == 2)
                break
            print(" j -> $j")
        }
        println()
    }

    println("****************")

    first@ for (i in 1..5) {
        print("i -> $i")
        for (j in 1..5) {
            if (j == 2) {
                break@first
            }
            print(" j -> $j")
        }
        println()
    }
    println()

    println("****************")

    for (i in 1..5){
        if (i == 4)
            continue
        println("i -> $i")
    }
}
