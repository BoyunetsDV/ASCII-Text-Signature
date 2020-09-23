import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var upperCaseLettersCount = input.nextInt()
    var lowerCaseLettersCount = input.nextInt()
    var digitsCount = input.nextInt()
    var symbolsCount = input.nextInt()

    val letters = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    var password = ""
    while (symbolsCount > 0) {
        if (symbolsCount > 0 && upperCaseLettersCount > 0) {
            password += getRandomValue(letters.toUpperCase(), password)
            symbolsCount--
            upperCaseLettersCount--
        }
        if (symbolsCount > 0 && digitsCount > 0) {
            password += getRandomValue(digits, password)
            symbolsCount--
            digitsCount--
        }
        if (symbolsCount > 0 && lowerCaseLettersCount > 0) {
            password += getRandomValue(letters, password)
            symbolsCount--
            lowerCaseLettersCount--
        }
        if (symbolsCount > 0 && lowerCaseLettersCount == 0 && upperCaseLettersCount == 0 && digitsCount == 0) {
            password += getRandomValue(letters, password)
            symbolsCount--
        }
    }
    print(password)
}

fun getRandomValue(carsString: String, password: String): Char {
    val previousLetter: Char = if (password.isEmpty()) {
        ' '
    } else {
        password[password.lastIndex]
    }

    var letter = carsString.random()
    while (letter == previousLetter) {
        letter = carsString.random()
    }
    return letter
}