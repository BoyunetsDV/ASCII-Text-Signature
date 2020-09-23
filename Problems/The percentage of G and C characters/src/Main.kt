import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val text = input.nextLine().toLowerCase()
    val i = text.count { it == 'c' } + text.count { it == 'g' }
    print(i.toDouble() / text.length * 100)
}