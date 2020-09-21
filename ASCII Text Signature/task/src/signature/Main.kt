package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var name = scanner.nextLine()
    name = "* $name *"
    val asterisks = CharArray(name.length)
    asterisks.fill('*', 0, name.length)
    println(asterisks.joinToString(""))
    println(name)
    println(asterisks.joinToString(""))

}
