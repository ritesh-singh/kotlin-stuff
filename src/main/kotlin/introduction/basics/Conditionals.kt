package introduction.basics

fun main(args: Array<String>) {
    var myString = ""

    if (myString != "") {
        print("Not empty")
    } else {
        print("Empty")
    }
    println()
    println("---------------------------------------")

    // If else can be also used as expression
    val result = if (myString != "") {
        print("Not empty")
    } else {
        print("Empty")
    }

    println(result)

    myString = "aaa"
    val resultt = if (myString != "") { // returns the last statement, in this case it matches first block and last is 20
        "Not empty!!"
        20
    } else {
        "Empty!!"
    }

    println(resultt)

    println("---------------------------------------------------------------------------------------------------------------------")

    // When statement -  replaces the switch operator
    // It can be used as an expression or an statement


    // when as statement
    val value = "value"
    when (value) {
        is String -> println("Excellent")
        "value" -> println("It's a value")
    }

    println("******************************************************************************************************")

    // when as expression
    val whenResult = when (value) {
        "Value" -> { // Mutiline statement
            println("It's a value")
            println("Second statement")
            "Returning from first statement"
        }
        !is String -> {
            println("Excellent")
            "Returning from second statement"
        }
        else -> {
            println("It comes to this")
        }
    }
    println(whenResult)


}
