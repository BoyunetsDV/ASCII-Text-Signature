import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val string = scanner.nextLine()
    val position = scanner.nextInt()
    print("Symbol # $position of the string \"$string\" is '${string[position - 1]}'")
}