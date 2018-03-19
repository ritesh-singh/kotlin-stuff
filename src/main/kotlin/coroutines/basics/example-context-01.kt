package coroutines.basics

import kotlinx.coroutines.experimental.*

/**
 * Coroutine context includes a coroutine dispatcher that determines what thread or threads the
 * corresponding coroutine uses for its execution. Coroutine dispatcher can confine coroutine execution to a specific thread,
 * dispatch it to a thread pool, or let it run unconfined.
 */

fun main(args: Array<String>) = runBlocking {
    val jobs = arrayListOf<Job>()

    jobs += launch(Unconfined) {
        // not confined -- will work with main thread
        println("      'Unconfined': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(coroutineContext) {
        // context of the parent, runBlocking coroutine
        println("'coroutineContext': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(CommonPool) {
        // will get dispatched to ForkJoinPool.commonPool (or equivalent)
        println("      'CommonPool': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(newSingleThreadContext("MyOwnThread")) {
        // will get its own new thread
        println("          'newSTC': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }
}

/**
 * The default dispatcher that we've used in previous sections is representend by DefaultDispatcher,
 * which is equal to CommonPool in the current implementation. So, launch { ... }
 * is the same as launch(DefaultDispatcher) { ... }, which is the same as launch(CommonPool) { ... }.
 **/


/**
 * Note, that newSingleThreadContext creates a new thread, which is a very expensive resource.
 * In a real application it must be either released, when no longer needed, using close function,
 * or stored in a top-level variable and reused throughout the application.
 * or stored in a top-level variable and reused throughout the application.
 **/