import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    var result = 0
    val halfLengthIndex = text.length / 2 - 1
    for (i in text.indices) {
        when {
            i <= halfLengthIndex -> result += text[i].toInt()
            else -> result -= text[i].toInt()
        }
    }
    if (result == 0) {
        print("YES")
    } else {
        print("NO")
    }
}