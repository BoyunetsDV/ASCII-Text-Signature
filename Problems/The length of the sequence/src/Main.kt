import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var counter = 0
    do {
        val num = scanner.nextInt()
        if (num != 0) {
            counter++
        }
    } while (num != 0)
    print(counter)
}