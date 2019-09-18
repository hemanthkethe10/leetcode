fun main() {
    println(firstUniqueChar("leetcode"))
}

fun firstUniqueChar(s: String): Int {
    return if (s.isEmpty()) {
        -1
    } else {
        val sMap = s.groupingBy { it }.eachCount()
        val unqSet = sMap.filterValues { l -> l == 1 }.keys
        if (unqSet.isEmpty()){
            -1
        } else {
            s.indexOf(unqSet.first())
        }
    }
}