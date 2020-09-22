import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var i = 1
    while (true) {
        val pow = i * i
        if (pow <= number) {
            println(pow)
            i++
        } else {
            break
        }
    }
}