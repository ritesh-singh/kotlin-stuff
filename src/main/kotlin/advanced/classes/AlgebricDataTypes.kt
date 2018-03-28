package advanced.classes

// ADT -> Algebraic DataTypes - Can have one type with restricted 2 values, like boolean can have true or false

// In kotlin this is achieved using sealed classes.

/**
 * Sealed classes are "extension of enum classes". They can exist in multiple instances
 * that contains state.
 */

/**
 * Sealed classes are used for representing restricted class hierarchies,when a value
 * can have one of the types from a limited set, but cannot have any other type.
 *
 * https://kotlinlang.org/docs/reference/sealed-classes.html
 */


/**
 *  Restriction, any class extending sealed classes, should be in the same file
 *  from kotlin 1.0, earlier it was restricted  to a nested class.
 */

sealed class PageResult

class Success(val content: String) : PageResult()
class Error(val code: Int, val message: String) : PageResult()

fun getUrlPage(url: String): PageResult {
    val wasValidCall = false

    return if (wasValidCall) {
        Success("The content")
    } else {
        Error(404, "Not found")
    }
}

fun main(args: Array<String>) {
    val pageResult = getUrlPage("/")
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}