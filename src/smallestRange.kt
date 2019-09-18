fun main() {
    println(smallestRangeI(intArrayOf(0, 10), 2))
}

fun smallestRangeI(A: IntArray, K: Int): Int {
    val difference = (A.max()!! - K) - (A.min()!! + K)
    return if (difference > 0) difference else 0
}