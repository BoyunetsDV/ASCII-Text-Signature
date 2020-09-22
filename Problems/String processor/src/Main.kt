import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val string1 = scanner.nextLine()
    val operator = scanner.nextLine()
    val string2 = scanner.nextLine()
    when (operator) {
        "equals" -> print(string1.compareTo(string2) == 0)
        "plus" -> print(string1.plus(string2))
        "endsWith" -> print(string1.endsWith(string2))
        else -> print("Unknown operation")
    }
}