fun main() {
    println(letterCombinations("23"))
}

fun letterCombinations(digits: String): List<String> {
    val phoneMap = mapOf(
        '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
        '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz"
    )
    return when {
        digits.isEmpty() -> emptyList()
        digits.length ==1 -> phoneMap.getValue(digits.toList().first()).map { it.toString() }
        else -> {
            val digitsList = digits.toList()
            val phoneDigits = digitsList.map { phoneMap[it]!! }
            println(phoneDigits)
            phoneDigits[0].map { l -> phoneDigits[1].map { s -> "$l$s" } }.flatten()
        }
    }
}