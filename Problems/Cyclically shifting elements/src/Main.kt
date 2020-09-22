import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val arraySize = scanner.nextInt()
    val array = IntArray(arraySize)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val t = array[array.lastIndex]
    for (j in array.lastIndex downTo 0) {
        if (j == 0) {
            array[j] = t
        } else {
            array[j] = array[j - 1]
        }
    }
    print(array.joinToString(" "))
}