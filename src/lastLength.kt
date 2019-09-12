fun main() {
    println(lengthOfLastWord("hello world "))
//    println("a ".split(" ").last())
}

fun lengthOfLastWord(s: String): Int {
    val lastElement = s.split(" ").last()
    return when (lastElement) {
        " " -> 0
        else -> lastElement.length
    }

}