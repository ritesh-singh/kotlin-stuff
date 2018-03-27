package advanced.functions


// Invoke opertator

// http://joshskeen.com/kotlins-invoke-operator/

class Requestt(val method: String, val query: String, val contentType: String)

class Responsee(var contents: String, var status: Status) {
    operator fun invoke(status: Status.() -> Unit) {

    }
}

class Statuss(var code: Int, var description: String)

class RouterHandlerr(val requestt: Requestt, val responsee: Responsee)


fun routeHandlerr(path: String, f: RouterHandlerr.() -> Unit): RouterHandlerr.() -> Unit = f

fun main(args: Array<String>) {
    routeHandlerr("index.html") {
        if (requestt.query != "") {
            // process
        }

        responsee {
            code = 404
            description = "Not found"
        }
    }


    val manager = Manager()
    manager("Do something!!")
}

class Manager {
    operator fun invoke(value: String) {

    }
}