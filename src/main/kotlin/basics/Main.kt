package basics

import basics.utils.someUtility as someAdditions


fun main(args: Array<String>) {
    println("Hello World..!!") // Implicit imported

    // someUtility("abc") // explicitly imported

    someAdditions("abc") // Named import in case of conflicts

}