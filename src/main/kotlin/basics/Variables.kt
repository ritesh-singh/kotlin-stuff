package basics


/**
 * var - Mutable -> can be changed
 * val - Immutable - cannot be changed
 *
 * In kotlin, everything is object.
 */

fun main(args: Array<String>) {
    var name: String = "Ritesh"
    var lastName = "Singh" // Inference

    val dobMonth: Int = 12
    val dobDay = 11 // Inference

    // Type - Inference
    val myLong = 10L
    val myFloat = 20F
    val myHex = 0x0F
    val myBinary = 0xb01

    // No implicit, conversion in kotlin

    val myInt = 20
    val myLongg = myInt // Treated as int, value stored as int, as type is inferred as int

    // val myLonggg: Long = myInt // Type mismatch, not implicit conversion

    val myLonggggg: Long = myInt.toLong() // Explicit conversion


    // String
    val char = 'A'
    val string = "This is string"
    val escapeCharacter = "With new line \n"

    val rawString = "This is line 1 " +
            "Line two " +
            "Line 3"
    val multipleLines = """
        This is an another way, of writing in multiple lines
        This is second line
        This is third line
        """

    // String interpolation
    val year = 10
    val yearStr = "Year is $year"

    val fName = "Ritesh"
    val nameLength = "Name length is ${fName.length}"

}