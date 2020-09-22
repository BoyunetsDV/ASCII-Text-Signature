import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val word = input.next()
    for (el in word) {
        if (el.isDigit()) {
            print(el)
            break
        }
    }
}