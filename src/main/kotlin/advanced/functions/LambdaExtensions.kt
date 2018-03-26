package advanced.functions

class Request(val method: String, val query: String, val contentType: String)

class Response(val content: String, val status: String)

class RouterHandler(val request: Request, val response: Response) {
    // Does some routing stuff
}


// Lambda extension function
fun routeHandler(f: RouterHandler.() -> Unit): RouterHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler {

    }

}