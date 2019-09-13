fun main() {
    println(isIsomorphic("ab", "aa"))
}

fun isIsomorphic(s: String, t: String): Boolean {
    val sRemove=removeDuplicates(s)
    val tRemove=removeDuplicates(t)
    return if (sRemove.length != tRemove.length) {
        false
    } else {
        val sOddIndex = sRemove.filterIndexed { index, _ -> index % 2 != 0 }.trim()
            .groupingBy { it.toInt() }.eachCount()
        val sEvenIndex=sRemove.filterIndexed { index, _ -> index % 2 == 0 }.trim()
            .groupingBy { it.toInt() }.eachCount()
        val tOddIndex = tRemove.filterIndexed { index, _ -> index % 2 != 0 }.trim()
            .groupingBy { it.toInt()}.eachCount()
        val tEvenIndex= tRemove.filterIndexed { index, _ -> index % 2 == 0 }.replace(" ","")
            .groupingBy { it.toInt() }.eachCount()
        return (sOddIndex.values.toList() == tOddIndex.values.toList()) &&
                (sEvenIndex.values.toList() == tEvenIndex.values.toList())
    }
}