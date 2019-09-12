fun main() {
    println(romanToInt("III"))
}

fun romanToInt(s: String): Int {
    var sum = 0
    for (i in 0..s.length) {
        when {
            i == s.length - 1 -> sum += getIntValue(s[i])
            getIntValue(s[i]) < getIntValue(s[i + 1]) -> sum -= getIntValue(s[i])
            else -> sum += getIntValue(s[i])
        }
    }

    return sum
}

fun getIntValue(input: Char): Int {
    return when (input) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}
