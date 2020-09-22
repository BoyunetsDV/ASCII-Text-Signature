import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val line1 = scanner.nextLine()
    val line2 = scanner.nextLine()
    print(line1.compareTo(line2, ignoreCase = true) == 0)
}