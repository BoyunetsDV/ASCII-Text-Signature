import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val word = input.next()
    var count = 0
    for (letter in 'a'..'z') {
        if (word.count { it == letter } == 1) {
            count++
        }
    }
    print(count)
}