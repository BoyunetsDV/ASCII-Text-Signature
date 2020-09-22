import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val number = scanner.nextInt()
    if (array.contains(number)) {
        print("YES")
    } else {
        print("NO")
    }
}