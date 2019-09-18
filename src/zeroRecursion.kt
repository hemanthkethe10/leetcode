import java.math.BigInteger

fun main() {
    println(trailingZeroes(25))
}

fun trailingZeroes(n: Int): Int {
//    println(factRec(n))
//    println(factNonRec(n))
//    println(factTailRec(BigInteger(n.toString()),BigInteger("1")))
    return if (n == 0 ) 0
    else
        factTailRec(BigInteger(n.toString()), BigInteger("1")).toString()
            .takeLastWhile { it == '0' }.length
}

fun factNonRec(num: Long): Long {
    var fact = 1L
    for (i in 1..num)
        fact *= i
    return fact
}

fun factRec(num: Long): Long {
    return if (num == 1L)
        num
    else
        num * factRec(num - 1)
}

tailrec fun factTailRec(num: BigInteger, fact: BigInteger): BigInteger {
    return if (num == BigInteger("1"))
        fact
    else {
        factTailRec(
            num.minus(BigInteger("1")),
            num.multiply(BigInteger(fact.toString()))
        )
    }
}