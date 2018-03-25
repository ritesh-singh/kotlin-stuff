package advanced.functions

/**
 * A lambda expression has access to closure (referencing a variable of the outer function, it will cause an instance
 * also to be created, therefore adding memory overhead)
 *
 * All, these lambda calls, impacting the call stack, as in have function calling an another function, that could
 * call another function and so on.
 *
 * These has performance impact, to minimize it we can make use of inline functions.
 *
 * Inline functions, it copies the code of inlined func, to where it's called, improves calling call stack.
 *
 * Should be used, when using function where lambdas are passed.
 *
 *
 * https://kotlinlang.org/docs/reference/inline-functions.html
 *
 * Inlining may cause the generated code to grow; however, if we do it
 * in a reasonable way (i.e. avoiding inlining large functions),
 * it will pay off in performance, especially at "megamorphic" call-sites inside loops.
 *
 * Inline functions, copies the functions and the lambda function, passed in and puts where it's called,
 * results to code overhead but improves creating function object and call stack.
 *
 * Avoid inlining large functions.
 */

/**
 * noinline -> In case you want only some of the lambdas passed to an inline function to be inlined,
 * you can mark some of your passed lambda function parameters with the noinline modifier:
 */


/**
 * One such restriction is, a function cannot be inlined if reference of lambda is stored
 * somewhere.
 */
inline fun tryingToInline(op: () -> Unit) {
    //val reference = op
    println("Assigned value")
    op()
}

inline fun operation(op: () -> Unit) {
    println("Before calling op")
    op()
    println("After calling op")
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}