fun main() {
    println(minDeletionSize(arrayOf("abc", "bad")))
}

fun minDeletionSize(A: Array<String>): Int {
    val inputList = A.map { it.toList() }
    val coloumnList = (1..inputList.first().size)
        .mapIndexed { index, _ -> inputList.map { it[index] } }
    println(coloumnList)
    return coloumnList.map { isSorted(it) }.filter { !it }.size
}

fun isSorted(list: List<Char>): Boolean {
    return list == list.sorted()
}