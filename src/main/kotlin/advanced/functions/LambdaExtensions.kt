package advanced.functions


// https://kotlinlang.org/docs/reference/type-safe-builders.html

// Lambda extensions / Lambda with receivers, allows us to create efficient ans
// expressive DSL's

class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {

    }
}

class Status(var code: Int, var description: String)

class RouterHandler(val request: Request, val response: Response) {
    // Does some routing stuff
}


fun response(response: Response.() -> Unit) {

}

// Lambda extension function
fun routeHandler(path: String, f: RouterHandler.() -> Unit): RouterHandler.() -> Unit = f


// Writing DSL's
fun main(args: Array<String>) {


    routeHandler("index.html") {
        if (request.query != "") {
            // process the request
        }
        response {
            status {
                code = 404
                description = "Some desc"
            }
        }
    }


}