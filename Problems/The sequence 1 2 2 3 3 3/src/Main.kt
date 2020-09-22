import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt())
    var index = 0
    var number = 1
    while (index < array.size) {
        repeat(number) {
            if (index < array.size) {
                array[index] = number
                index++
            }
        }
        number++
    }
    print(array.joinToString(" "))
}