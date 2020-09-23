import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    var i = 0
    var j = word.lastIndex
    var isPalindrom = true
    while (i < j) {
        if (word[i] != word[j]) {
            isPalindrom = false
            break
        }
        i++
        j--
    }
    if (isPalindrom) {
        print("yes")
    } else {
        print("no")
    }
}