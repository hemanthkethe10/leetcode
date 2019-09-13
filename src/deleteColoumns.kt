fun main() {
    println(minDeletionSize(arrayOf("a", "b")))
}

fun minDeletionSize(A: Array<String>): Int {
    val inputList = A.map { it.toList() }
//        .mapIndexed{index, list ->list[index] }
    val coloumnList = (1..inputList.first().size)
        .mapIndexed { index, _ -> inputList.map { it[index] } }
    return coloumnList.map { isSorted(it) }.filter { !it }.size
}

fun isSorted(list: List<Char>): Boolean {
    return list == list.sorted()
}