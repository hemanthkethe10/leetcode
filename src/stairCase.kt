fun main() {
    println(climbStairs(4))
}

fun climbStairs(n: Int): Int {
    return fibonacciTail(9, 0, 1)
}

fun fibonacciRec(num: Int): Int {
    return when (num) {
        0 -> return 0
        1 -> return 1
        else -> fibonacciRec(num - 1) + fibonacciRec(num - 2)
    }
}

fun fibonacciTail(num: Int, a: Int, b: Int): Int {
    return when (num) {
        0 -> return a
        1 -> return b
        else ->
            fibonacciTail(num - 1, b, a + b)
    }
}

