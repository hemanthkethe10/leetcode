import kotlin.math.pow

fun main() {
    println(isPowerOfTwo(218))
}

fun isPowerOfTwo(n: Int): Boolean {
    val itr = (0..100).iterator()
    val powerList = (0..100).map { 2.0.pow(itr.next()) }
    return powerList.contains(n.toDouble())
}