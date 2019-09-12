import java.math.BigInteger

fun main() {
    println(
        addBinary(
            "101000001001001101100100000101011110110",
            "11010100101110111000111110011000101010000110101110"
        ).reversed()
    )
}

fun addBinary(a: String, b: String): String {
    val valueA = bintoDec(a)
    println(valueA)
    val valueB = bintoDec(b)
    return if (valueA.add(valueB) == BigInteger("0")) "0"
    else
        decToBin(valueA.add(valueB), "")
}

fun bintoDec(l: String): BigInteger {
    val a = 0..100
    val itr = a.iterator()
    return l
        .reversed()
        .map {
            it.toLong() - 48
        }
        .fold(BigInteger("0"), { acc, i ->
            acc.add(BigInteger(BigInteger(i.toString()).multiply(BigInteger("2").pow(itr.next())).toString()))
        })
}

fun decToBin(num: BigInteger, str: String): String {
    return if (num.equals(BigInteger("0")))
        str
    else {
        decToBin(num.divide(BigInteger("2")), str + "${num % BigInteger("2")}")
    }


}