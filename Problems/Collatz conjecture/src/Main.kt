import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var number = scanner.nextInt()
    print(number)
    while (number != 1) {
        if (number % 2 == 0) {
            number /= 2
        } else {
            number = number * 3 + 1
        }
        print(" $number")
    }
}