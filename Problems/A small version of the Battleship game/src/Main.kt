import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val xs = IntArray(3)
    val ys = IntArray(xs.size)
    for (i in 0..xs.lastIndex) {
        xs[i] = input.nextInt()
        ys[i] = input.nextInt()
    }

    val x = mutableListOf<Int>()
    val y = mutableListOf<Int>()
    for (i in 1..5) {
        if (!xs.contains(i)) {
            x.add(i)
        }
        if (!ys.contains(i)) {
            y.add(i)
        }
    }
    println(x.joinToString(" "))
    println(y.joinToString(" "))
}