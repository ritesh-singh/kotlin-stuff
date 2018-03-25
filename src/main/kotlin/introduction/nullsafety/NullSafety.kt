package introduction.nullsafety

/**
 * By default kotlin in null safe
 */

fun main(args: Array<String>) {
    val message: String = "A String"
    println(message.length)

    // Null safe - for eg, types cannot be null  by default
    //val msg:String = null

    // To, work with null type
    val nullMessage: String? = null
    val inferredNull = null

//    println(nullMessage.length)
    println(nullMessage?.length)

    println(nullMessage!!.length) // throw exception
}