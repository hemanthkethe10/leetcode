fun main() {
    println(addDigits(32344455))
}

fun addDigits(num: Int): Int {
    return if (num.toString().length == 1)
        num
    else {
        addDigits(num.toString().fold(0)
        { acc, c -> acc + (c.toInt() - 48) })
    }
}