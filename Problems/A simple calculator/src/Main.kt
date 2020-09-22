import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextLong()
    val operator = scanner.next()
    val number2 = scanner.nextLong()
    when (operator) {
        "+" -> print(number1 + number2)
        "-" -> print(number1 - number2)
        "/" -> {
            if (number2 == 0L) {
                print("Division by 0!")
            } else {
                print(number1 / number2)
            }
        }
        "*" -> print(number1 * number2)
        else -> print("Unknown operator")
    }
}