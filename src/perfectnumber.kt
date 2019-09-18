fun main() {
    println(checkPerfectNumber(1))
}

fun checkPerfectNumber(num: Int): Boolean {
    return if (num == 0 || num < 0) {
        false
    } else {
        val factorsList = factorsExcludingN(num)
        num == factorsList.sum()
    }
}

fun factorsExcludingN(n: Int): List<Int> {
    return (1 until n).fold(emptyList()) { acc, i ->
        if (n % i == 0) acc.plus(i) else acc
    }
}