import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    when {
        a / 10 == 0 -> print(1)
        a / 100 == 0 -> print(2)
        a / 1_000 == 0 -> print(3)
        a / 10_000 == 0 -> print(4)
    }
}