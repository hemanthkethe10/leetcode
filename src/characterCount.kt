fun main() {
    println(countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach"))
}

fun countCharacters(words: Array<String>, chars: String) {
    val charsMap = chars.groupingBy { it }.eachCount()
    val wordsMap=words.map { it.groupingBy { l->l }.eachCount() }
    wordsMap.map {  }
}