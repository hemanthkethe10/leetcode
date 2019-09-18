fun main() {
    println(countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach"))
}

fun countCharacters(words: Array<String>, chars: String) {
    val charsMap = chars.toList().sorted()
        .groupingBy { it }.eachCount()
    println(charsMap)
    val wordsMap=words.map { it.toList().sorted().groupingBy { l->l }.eachCount() }
    println(wordsMap.map { it.keys })
}