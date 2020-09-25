package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter name and surname: ")
    val name = scanner.nextLine()
    print("Enter person's status: ")
    val status = scanner.nextLine()

    val alphabet = " abcdefghijklmnopqrstuvwxyz"
    val topAlp = arrayOf("    ", "____", "___ ", "____", "___ ", "____", "____", "____", "_  _", "_", " _", "_  _", "_   ", "_  _", "_  _", "____", "___ ", "____", "____", "____", "___", "_  _", "_  _", "_ _ _", "_  _", "_   _", "___ ")
    val midAlp = arrayOf("    ", "|__|", "|__]", "|   ", "|  \\", "|___", "|___", "| __", "|__|", "|", " |", "|_/ ", "|   ", "|\\/|", "|\\ |", "|  |", "|__]", "|  |", "|__/", "[__ ", " | ", "|  |", "|  |", "| | |", " \\/ ", " \\_/ ", "  / ")
    val botAlp = arrayOf("    ", "|  |", "|__]", "|___", "|__/", "|___", "|   ", "|__]", "|  |", "|", "_|", "| \\_", "|___", "|  |", "| \\|", "|__|", "|   ", "|_\\|", "|  \\", "___]", " | ", "|__|", " \\/ ", "|_|_|", "_/\\_", "  |  ", " /__")

    var asterics: CharArray
    var secondLine = ""
    var thirdLine = ""
    var fourthLine = ""
    var fifthLine = ""

    for (letter in name) {
        val position = alphabet.indexOf(letter.toLowerCase())
        secondLine += "${topAlp[position]} "
        thirdLine += "${midAlp[position]} "
        fourthLine += "${botAlp[position]} "
    }
    if (status.length > secondLine.length) {
        val firstPart = CharArray((status.length - secondLine.length + 1) / 2)
        firstPart.fill(' ')
        val secondPart = CharArray((status.length - secondLine.length + 1) / 2 + (status.length - secondLine.length + 1) % 2)
        secondPart.fill(' ')
        secondLine = "*  ${firstPart.joinToString("")}$secondLine${secondPart.joinToString("")} *"
        thirdLine = "*  ${firstPart.joinToString("")}$thirdLine${secondPart.joinToString("")} *"
        fourthLine = "*  ${firstPart.joinToString("")}$fourthLine${secondPart.joinToString("")} *"
        fifthLine = "*  $status  *"
    } else {
        val fifthFirstPart = CharArray((secondLine.length - status.length - 1) / 2)
        fifthFirstPart.fill(' ')
        val fifthSecondPart = CharArray((secondLine.length - status.length - 1) / 2 + (secondLine.length - status.length - 1) % 2)
        fifthSecondPart.fill(' ')
        secondLine = "*  $secondLine *"
        thirdLine = "*  $thirdLine *"
        fourthLine = "*  $fourthLine *"
        fifthLine = "*  ${fifthFirstPart.joinToString("")}$status${fifthSecondPart.joinToString("")}  *"
    }

    val asterisks = CharArray(secondLine.length)
    asterisks.fill('*', 0, secondLine.length)
    println(asterisks.joinToString(""))
    println(secondLine)
    println(thirdLine)
    println(fourthLine)
    println(fifthLine)
    println(asterisks.joinToString(""))
}
