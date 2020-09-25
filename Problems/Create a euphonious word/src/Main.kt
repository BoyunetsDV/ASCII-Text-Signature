import java.util.*

fun main() {
    val consonants = "bcdfghjklmnpqrstvwxz"
    val vowels = "aeiouy"
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    var count = 0
    var index = 0
    while (index <= text.lastIndex - 2) {
        if (consonants.contains(text[index]) && consonants.contains(text[index + 1]) && consonants.contains(text[index + 2]) ||
                vowels.contains(text[index]) && vowels.contains(text[index + 1]) && vowels.contains(text[index + 2])) {
            count++
            index += 2
        } else {
            index++
        }
    }
    print(count)
}