fun main() {
//    println(removeDuplicates("abbaca"))
    println(buddyStrings("aa", "aa"))
}

fun removeDuplicates(S: String): String {
    return S.toList().fold(emptyList<Char>())
    { result, value ->
        if (result.isNotEmpty() && result.last() == value) result
        else result + value
    }.toString()
}

fun buddyStrings(A: String, B: String): Boolean {
    return when {
        A.toSet() == B.toSet() && A.toSet().size ==1-> true
        A == B && A.toSet().size !=1 -> false
        else -> {
            val Amap = A.groupingBy { it }.eachCount().values.sorted()
            val Bmap = B.groupingBy { it }.eachCount().values.sorted()
            Amap == Bmap
        }
    }
}


