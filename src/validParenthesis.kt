fun main() {
    println(isValid("{[]}"))
}

fun isValid(s: String): Boolean {
    if (s == "") {
        return true
    } else {
        val changedList = s.map {
            when (it) {
                '(' -> 1
                ')' -> -1
                '[' -> 2
                ']' -> -2
                '{' -> 3
                else -> -3
            }
        }
        println(changedList.mapIndexed { index, _ ->
            changedList.take(index + 1).sum()
        })
        return changedList.mapIndexed { index, _ ->
            changedList.take(index + 1).sum()
        }.filterIndexed { index, _ -> index % 2 != 0 }.toSet() == setOf(0)
    }
}