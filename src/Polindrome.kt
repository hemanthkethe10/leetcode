fun main() {
    println(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
return when{
    x.toString().reversed() == x.toString() -> true
    else -> false
}
}