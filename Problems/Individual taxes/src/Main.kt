import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val countOfCompanies = scanner.nextInt()
    val incomes = IntArray(countOfCompanies) { scanner.nextInt() }
    val individualTaxes = IntArray(countOfCompanies) { scanner.nextInt() }

    var maxIndex = Int.MIN_VALUE
    var maxValue = Double.MIN_VALUE
    for (i in 0..incomes.lastIndex) {
        val currentCompanyTaxes = incomes[i] * individualTaxes[i] * 0.01
        if (currentCompanyTaxes > maxValue) {
            maxIndex = i
            maxValue = currentCompanyTaxes
        }
    }
    print(maxIndex + 1)
}