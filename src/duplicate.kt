fun main() {
    println(findTheDifference("leettttytyt", "leete"))
}

fun findTheDifference(s: String, t: String): Char {
    val requiredList = t.toList() - s.toList()
    println(requiredList)
    return requiredList.first()
}