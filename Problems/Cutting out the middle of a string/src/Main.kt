import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val output: String

    output = if (text.length % 2 == 0) {
        text.removeRange((text.length - 1) / 2..(text.length - 1) / 2 + 1)
    } else {
        text.removeRange((text.length - 1) / 2..(text.length - 1) / 2)
    }
    print(output)
}