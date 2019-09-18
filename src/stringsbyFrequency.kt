fun main() {
    println(numSmallerByFrequency(arrayOf("bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"),
        arrayOf("aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa")))
}

fun numSmallerByFrequency(queries: Array<String>, words: Array<String>){
    val smallCharCount = queries.map { l ->
        l.toList().sorted()
            .takeWhile { it == l.min()!! }.size
    }
    println(smallCharCount)
    val wordsFrequency = words.map { l ->
        l.toList().sorted()
            .takeWhile { it == l.min()!! }.size
    }
    println(wordsFrequency)
    println(smallCharCount.map { wordsFrequency.filter { l -> l > it }.size })
}