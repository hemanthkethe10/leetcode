fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
}

fun isPalindrome(s: String): Boolean {
    val regex = "[^\\w]".toRegex()
    val modifiedString=s.replace(regex,"").map { it.toLowerCase() }
        .joinToString(separator = "")
    return modifiedString.reversed() == modifiedString
}