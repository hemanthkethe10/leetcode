fun main() {
    sortedSquares(intArrayOf(-4, -1, 0, 3, 10))
    println(selfDividingNumbers(2, 22))
    println(isSelfDivide(13))
}

fun sortedSquares(A: IntArray): IntArray {
    return A.map { it * it }.sorted().toIntArray()
}

fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    return (left..right).fold(emptyList())
    { acc, i -> if (isSelfDivide(i)) acc.plus(i) else acc }
}

fun isSelfDivide(num: Int): Boolean {
    val numList = num.toString().map { it.toInt() - 48 }
    return if (numList.contains(0)) {
        false
    } else {
//        numList.fold(false){ acc, i ->  if (num%i==0) true else acc
        numList.map { num % it }.toSet() == setOf(0)
    }
}

