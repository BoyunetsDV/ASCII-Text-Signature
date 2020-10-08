package signature

import java.io.File
import java.util.*

var userName = ""
var userStatus = ""
var romanFontArray: List<String> = emptyList()
var mediumFontArray: List<String> = emptyList()

fun main() {
    readInformationAboutUser()
    loadFonts()
    displayCard()
}

fun readInformationAboutUser() {
    val scanner = Scanner(System.`in`)
    print("Enter name and surname: ")
    userName = scanner.nextLine()
    print("Enter person's status: ")
    userStatus = scanner.nextLine()
}

fun loadFonts() {
    romanFontArray = File("C:/Users/user/IdeaProjects/ASCII Text Signature/ASCII Text Signature/task/resources/roman.txt").readLines(Charsets.UTF_8)
    mediumFontArray = File("C:/Users/user/IdeaProjects/ASCII Text Signature/ASCII Text Signature/task/resources/medium.txt").readLines(Charsets.UTF_8)
}

fun displayCard() {
    var convertedName = convertToNewFont(romanFontArray, userName)
    var convertedStatus = convertToNewFont(mediumFontArray, userStatus)
    val maxLength = if (convertedName[0].length > convertedStatus[0].length) {
        convertedName[0].length
    } else {
        convertedStatus[0].length
    }
    convertedName = addSpaces(convertedName, maxLength)
    convertedStatus = addSpaces(convertedStatus, maxLength)
    val completedCard = addBorders(convertedName, convertedStatus)
    print(completedCard.joinToString("\n"))
}

fun convertToNewFont(fontArray: List<String>, text: String): Array<String> {
    val fontSize = fontArray[0].split(' ')[0].toInt()
    val space = when (fontSize) {
        10 -> "          "
        3 -> "     "
        else -> ""
    }
    val rows = Array(fontSize) { "" }
    for (letter in text) {
        val letterIndex = findLetterIndexToStartWith(fontArray, fontSize, letter)
        for (i in 0 until fontSize) {
            if (letterIndex == -1) {
                rows[i] += space
            } else {
                rows[i] += fontArray[letterIndex + i]
            }
        }
    }
    return rows
}

fun findLetterIndexToStartWith(fontArray: List<String>, fontSize: Int, letter: Char): Int {
    for (index in 1 until fontArray.size step fontSize + 1) {
        val currentLetter = fontArray[index].split(' ')[0][0]
        if (currentLetter == letter) {
            return index + 1
        }
    }
    return -1
}

fun addSpaces(arr: Array<String>, length: Int): Array<String> {
    val spacesCount = length - arr[0].length
    if (spacesCount == 0) {
        return arr
    }
    val leftSpacesString = CharArray(spacesCount / 2) { ' ' }.joinToString("")
    val rightSpacesString = CharArray(spacesCount - spacesCount / 2) { ' ' }.joinToString("")
    for (i in arr.indices) {
        arr[i] = "$leftSpacesString${arr[i]}$rightSpacesString"
    }
    return arr
}

fun addBorders(namePart: Array<String>, statusPart: Array<String>): Array<String> {
    for (i in namePart.indices) {
        namePart[i] = "88  ${namePart[i]}  88"
    }
    for (i in statusPart.indices) {
        statusPart[i] = "88  ${statusPart[i]}  88"
    }
    val borderRow = CharArray(namePart[0].length) { '8' }.joinToString("")
    return arrayOf(borderRow, *namePart, *statusPart, borderRow)
}