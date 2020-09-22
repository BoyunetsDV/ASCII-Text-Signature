import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var max = Int.MIN_VALUE
    var maxIndex = Int.MIN_VALUE
    for (i in 0..array.lastIndex) {
        if (array[i] > max) {
            max = array[i]
            maxIndex = i
        }
    }
    print(maxIndex)
}