import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.nextInt()) {
        1 -> print("No!")
        2 -> print("Yes!")
        3 -> print("No!")
        4 -> print("No!")
        else -> print("Unknown number")
    }
}