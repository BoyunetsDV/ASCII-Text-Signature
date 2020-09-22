import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    var countOfTriples = 0
    for (i in 0..array.lastIndex - 2) {
        if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
            countOfTriples++
        }
    }
    print(countOfTriples)
}