fun main() {
    println(shortestToChar("leetcode", 'e'))
}

fun shortestToChar(S: String, C: Char): List<Int> {
    val list = S.map { if (it == C) 0 else 1 }
    return list.mapIndexed { index, _ ->
        when {
            (index==0 && list[index]!=0)  -> 1
            list[index] == 0 -> 0
            else -> list[index - 1]+1
        }
    }
}