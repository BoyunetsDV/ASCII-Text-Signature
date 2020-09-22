import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    when (scanner.next()) {
        "gryffindor" -> print("bravery")
        "hufflepuff" -> print("loyalty")
        "slytherin" -> print("cunning")
        "ravenclaw" -> print("intellect")
        else -> print("not a valid house")
    }
}