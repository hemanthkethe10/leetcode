fun main() {
    println(judgeCircle("UD"))
}

fun judgeCircle(moves: String): Boolean {
    val characterCount = moves.groupingBy { it }.eachCount()
//    val U = characterCount.getOrDefault('U', 0)
//    val D = characterCount.getOrDefault('D', 0)
//    val L = characterCount.getOrDefault('L', 0)
//    val R = characterCount.getOrDefault('R', 0)
    return when {
        (characterCount.getOrDefault('U', 0) == characterCount.getOrDefault('D', 0)
                && characterCount.getOrDefault('L', 0) == characterCount.getOrDefault('R', 0))
        -> true
        else -> false
    }
}