fun main() {
    println(wordPattern("abba", "dog cat dog cat"))
}

fun wordPattern(pattern: String, str: String): Boolean {
    val patternMap = pattern.groupingBy { it }.eachCount()
    val stringMap = str.split(" ").groupingBy { it }.eachCount()
    val k = patternMap.values.toList() == stringMap.values.toList()
    return k
}