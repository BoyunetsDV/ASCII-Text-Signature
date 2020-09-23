import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    var output = ""
    for (l in text) {
        output = output.plus("$l$l")
    }
    print(output)
}