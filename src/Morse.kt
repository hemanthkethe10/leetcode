fun main() {
    println(uniqueMorseRepresentations(arrayOf("gin", "zen", "gig", "msg")))
}

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val alphabets = listOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )
    val morseList = words.map {
        it.map {
            alphabets[it.toInt() - 96 - 1]
        }
    }
//    println(morseList.map { it.joinToString(separator = "") })
    return morseList.map { it.joinToString(separator = "") }.toSet().size
}