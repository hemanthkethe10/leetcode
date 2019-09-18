fun main() {
    println(validPalindrome("atbbga"))
}

fun validPalindrome(s: String): Boolean {
    val sMap = s.groupingBy { it }.eachCount().values
    println(sMap)
    val oneList = sMap.toList().takeLastWhile { it == 1 }
    println(oneList)
    return if (sMap.first() != sMap.last())
        false
    else
        oneList.size <= 2
}