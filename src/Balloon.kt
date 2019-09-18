fun main() {
    println(maxNumberOfBalloons(""))
}

fun maxNumberOfBalloons(text: String): Int {
    val textMap = text.groupingBy { it }.eachCount()
    return if (textMap.keys.containsAll(setOf('b', 'a', 'l', 'o', 'n'))) {
        val bCount = textMap.getOrDefault('b', 0) / 1
        val aCount = textMap.getOrDefault('a', 0) / 1
        val lCount = textMap.getOrDefault('l', 0) / 2
        val oCount = textMap.getOrDefault('o', 0) / 2
        val nCount = textMap.getOrDefault('n', 0) / 1
        listOf(bCount, aCount, lCount, oCount, nCount).min()!!
    } else {
        return 0
    }
}