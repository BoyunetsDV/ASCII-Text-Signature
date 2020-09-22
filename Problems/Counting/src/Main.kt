import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val arraySize = scanner.nextInt()
    val array = IntArray(arraySize)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val number = scanner.nextInt()
    print(array.count { it == number })
}