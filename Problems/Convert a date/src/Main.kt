import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val dataArr = scanner.next().split('-')
    print("${dataArr[1]}/${dataArr[2]}/${dataArr[0]}")
}