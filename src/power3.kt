import kotlin.math.log10
import kotlin.math.sqrt

fun main() {
// println(isPowerOfThree(10))
    println(perfectSquare(900))
}

fun isPowerOfThree(n: Int): Boolean {
    return log10(n.toDouble()) / log10(3.toDouble()) % 1 == 0.0
}

fun isPowerOfFour(n: Int): Boolean {
    return log10(n.toDouble()) / log10(4.toDouble()) % 1 == 0.0
}

fun perfectSquare(n: Int): Boolean {
//    val itr=(1..100).iterator()
//    val value= log10(n.toDouble())/ log10(itr.next().toDouble())
    return sqrt(n.toDouble()) % 1 == 0.0
}