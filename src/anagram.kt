fun main() {
    println(isAnagram("integral", "triangle"))
}

fun isAnagram(s: String, t: String): Boolean {
    val sMap = s.groupBy { it }
    val tMap = t.groupBy { it }
    return sMap == tMap
}