import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var maxPosition = 0
    var position = 0
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        position++
        if (num > max) {
            max = num
            maxPosition = position
        }
    }
    print("$max $maxPosition")
}