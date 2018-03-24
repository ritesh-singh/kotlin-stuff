package stdlib

// Kotlin's Standard Extension Functions

// http://beust.com/weblog/2015/10/30/exploring-the-kotlin-standard-library/

// https://proandroiddev.com/the-difference-between-kotlins-functions-let-apply-with-run-and-else-ca51a4c696b8


// https://ask.ericlin.info/post/2017/06/subtle-differences-between-kotlins-with-apply-let-also-and-run/

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val builder = StringBuilder()
    builder.append("content: ")
    builder.append(builder.javaClass.canonicalName)

    println(builder.toString())


    println("------------------------------")

    // src - https://ask.ericlin.info/post/2017/06/subtle-differences-between-kotlins-with-apply-let-also-and-run/

    // also vs apply
    /**
     * Takes T as receiver and returns T,
     * the block returns Unit
     *
     * Both are same except, usage of it in also, but in apply no need, check block()
     */
    StringBuilder().also {
        it.append("content: ")
        it.append(it.javaClass.canonicalName)
    }.print()


    StringBuilder().apply {
        append("content: ")
        append(javaClass.canonicalName)
    }.print()

    println("-----------------------------------------------")

    // let vs run
    /**
     * Takes T as receiver but returns R, the value returned by block
     */
    StringBuilder().let {
        it.append("content: ")
        it.append(it.javaClass.canonicalName)
        27
    }.print()


    StringBuilder().run {
        append("content: ")
        append(javaClass.canonicalName)
        37
    }.print()

    println("-----------------------------------------------")


    // with()
    /**
     * with() is not an extension function on type T,
     * but it takes a instance of T as the first argument
     *
     * block is defined as T.() -> R so you don’t have to use it, and you can change the return value
     * in block body.
     */

    with(StringBuilder()){
        append("content: ")
        append(javaClass.canonicalName)
    }.print()

}