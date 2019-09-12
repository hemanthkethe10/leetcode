fun main() {
    println(wordPattern("abba", "dog cat cat dogi"))
}

fun wordPattern(pattern: String, str: String):Boolean {
   val patternMap=pattern.groupingBy { it }.eachCount()
    val stringMap= str.split(" ").groupBy { it }.mapValues { it.value.size }
    val k=patternMap.values.toList()==stringMap.values.toList()
    return k
}