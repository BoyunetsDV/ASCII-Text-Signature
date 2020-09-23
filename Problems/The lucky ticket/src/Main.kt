import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val list = input.next().map { c -> c.toInt() }
    if (list[0] + list[1] + list[2] == list[3] + list[4] + list[5]) {
        print("Lucky")
    } else {
        print("Regular")
    }
}