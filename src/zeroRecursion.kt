fun main() {
    println(trailingZeroes(51))
}

fun trailingZeroes(n: Long) {
    println(factRec(n))
    println(factNonRec(n))
    println(factTailRec(n,1))
// return fact(n).toString().takeLastWhile { it=='0' }.length
}

fun factNonRec(num:Long):Long{
    var fact=1L
    for (i in 1..num)
        fact *= i
    return fact
}

fun factRec(num: Long):Long{
    return if (num==1L)
        num
    else
        num*factRec(num-1)
}

tailrec fun factTailRec(num: Long,fact:Long):Long {
    return if (num == 1L)
        fact
    else {
        factTailRec(num - 1,num*fact)
    }
}