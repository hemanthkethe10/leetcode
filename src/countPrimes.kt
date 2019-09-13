fun main() {
    println(countPrimes(1))
}

fun countPrimes(n: Int): Int {
    return if (isPrime(n)||n==1)
        (1..n step 2).fold(0) { acc, i -> if (isPrime(i)) acc + 1 else acc }
    else
    (1..n step 2).fold(0) { acc, i -> if (isPrime(i)) acc + 1 else acc }+1
}

fun isPrime(a: Int): Boolean {
    return if (a == 1)
        false
    else {
        val b = 2..kotlin.math.sqrt(a.toDouble()).toInt()
        val c = b.fold(0, { acc, i ->
            if (a % i == 0) acc + 1 else acc
        })
        c == 0
    }
}