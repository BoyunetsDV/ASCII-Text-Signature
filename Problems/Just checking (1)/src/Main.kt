import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    var occurNextToEachOther = false
    for (i in 0 until array.lastIndex) {
        if (array[i] == n && array[i + 1] == m || array[i + 1] == n && array[i] == m) {
            occurNextToEachOther = true
            break
        }
    }
    if (occurNextToEachOther) {
        print("YES")
    } else {
        print("NO")
    }
}