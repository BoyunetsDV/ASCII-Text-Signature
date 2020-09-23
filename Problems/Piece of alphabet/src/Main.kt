import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    print(alphabet.contains(word))
}