import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val url = scanner.next()
    val params = url.substring(url.indexOf('?') + 1).split('&')
    var containsPassword = false
    var password = ""
    for (param in params) {
        if (!containsPassword && param.startsWith("pass=")) {
            password = param.substring(param.indexOf('=') + 1)
            containsPassword = true
        }
        val parameter = param.substring(0, param.indexOf('='))
        var value = param.substring(param.indexOf('=') + 1)
        if (value.isEmpty()) {
            value = "not found"
        }
        println("$parameter : $value")
    }
    if (containsPassword) {
        println("password : $password")
    }
}