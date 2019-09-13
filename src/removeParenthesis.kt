fun main() {
    val str = "(()())(())(()(()))"
    println(removeOuterParentheses(str))
}

fun removeOuterParentheses(S: String):String {
    val parenthesisList = S.trim().toList().map { if (it == '(') 1 else -1 }
    val finalList = parenthesisList.mapIndexed { index, i ->
        val k = parenthesisList.take(index + 1)
        val count = sum(k)
        when (index) {
            0 -> i
            else -> count
        }
    }
    val substr = finalList.joinToString()
        .replace(" ", "")
        .replace(",", "").split("0")
        .map { it.drop(1) }
    val removedPList = substr.joinToString(separator = " ").trim()
   return if (removedPList.toSet().size == 1 ) {
        ""
    } else {
        removedPList.mapIndexed {
            index, c -> if (c.toInt()==32) ' ' else
            when{
            index==0 -> '('
            (c.toInt()-48 < removedPList[index-1].toInt()-48) -> ')'
            (c.toInt()-48 > removedPList[index-1].toInt()-48)  -> '('
            index==removedPList.length-1 -> ')'
            else -> ' '
        }
        }.joinToString().replace(",","").split("\\s".toRegex()).joinToString(separator = "")
    }
}

fun sum(list: List<Int>): Int {
    return list.fold(0) { acc, i -> acc + i }
}
