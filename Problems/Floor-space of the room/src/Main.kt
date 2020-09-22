import java.util.*

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    when (scanner.next()) {
        "triangle" -> triangleCalculations()
        "rectangle" -> rectangleCalculations()
        "circle" -> circleCalculations()
    }
}

fun triangleCalculations() {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()
    val p = (a + b + c) / 2
    print(Math.sqrt(p * (p - a) * (p - b) * (p - c)))
}

fun rectangleCalculations() {
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    print(a * b)
}

fun circleCalculations() {
    val p = 3.14
    val r = scanner.nextDouble()
    print(Math.pow(r, 2.0) * p)
}