import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val text = input.next()
    var result = ""
    var prev = '_'
    var currentCount = 1
    for (i in text.indices) {
        if (i == 0) {
            prev = text[i]
        } else if (text[i] != prev) {
            result += "$prev$currentCount"
            prev = text[i]
            currentCount = 1
        } else {
            currentCount++
        }

        if (i == text.lastIndex) {
            result += "$prev$currentCount"
        }
    }
    print(result)
}