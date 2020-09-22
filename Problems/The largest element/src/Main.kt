import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    do {
        val num = scanner.nextInt()
        if (num != 0 && num > max) {
            max = num
        }
    } while (num != 0)
    print(max)
}