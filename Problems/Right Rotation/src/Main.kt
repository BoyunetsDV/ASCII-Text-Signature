import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var array = IntArray(scanner.nextInt())
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    var shift = scanner.nextInt()
    if (shift > array.size) {
        shift %= array.size
    }

    val firstPart = array.copyOfRange(0, array.size - shift)
    val secondPart = array.copyOfRange(array.size - shift, array.size)
    array = secondPart.plus(firstPart)

    print(array.joinToString(" "))
}