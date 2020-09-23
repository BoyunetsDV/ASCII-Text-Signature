import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val text = input.nextLine()
    val subs = input.nextLine()
    print(text.split("$subs").count() - 1)
}