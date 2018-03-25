package advanced.functions

/**
 * Operator Overloading
 *
 *
 * https://kotlinlang.org/docs/reference/operator-overloading.html
 *
 * Provide functionality by overloading the operator
 *
 * To implement an operator, we provide a member function or an extension function with a fixed name,
 * for the corresponding type, i.e. left-hand side type for binary operations
 * and argument type for unary ones. Functions that overload operators need to be marked
 * with the operator modifier.
 */


// Overload as member function
data class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }

}


// Overload as extension function
operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach {
        this.append(it)
    }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 40) + Time(3, 20)

    println(newTime)

    val sb = StringBuilder()
    for (str in sb) {
        str + "Value"
    }
}