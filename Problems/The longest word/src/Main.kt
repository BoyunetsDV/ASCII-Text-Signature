import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val words = scanner.nextLine().split(" ")
    var maxLength = Int.MIN_VALUE
    var maxWord = ""
    for (word in words) {
        if (word.length > maxLength) {
            maxLength = word.length
            maxWord = word
        }
    }
    print(maxWord)
}