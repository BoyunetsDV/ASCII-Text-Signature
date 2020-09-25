import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    val n = scanner.nextInt()
    if (text.length <= n) {
        print(text)
    } else {
        print(text.substring(n) + text.substring(0, n))
    }
}