import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var amountOfMoney = scanner.nextInt()
    var moneyNeed = 0
    while (scanner.hasNextInt()) {
        val purchaseCost = scanner.nextInt()
        if (amountOfMoney >= purchaseCost) {
            amountOfMoney -= purchaseCost
        } else {
            moneyNeed += purchaseCost
        }
    }
    if (moneyNeed > 0) {
        print("Error, insufficient funds for the purchase. You have $amountOfMoney, but you need $moneyNeed.")
    } else {
        print("Thank you for choosing us to manage your account! You have $amountOfMoney money.")
    }
}