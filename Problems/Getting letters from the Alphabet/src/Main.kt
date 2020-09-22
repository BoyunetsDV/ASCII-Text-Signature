import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val letter = input.next().toCharArray()[0]
    for (l in 'a'..'z') {
        if (l == letter) {
            return
        } else {
            print(l)
        }
    }
}