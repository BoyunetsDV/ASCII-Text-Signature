import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val word = input.next()
    for (letter in 'a'..'z') {
        if (!word.contains(letter)) {
            print(letter)
        }
    }
}