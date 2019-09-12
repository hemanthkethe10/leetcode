fun main() {
    println(strStr("hello", "lle"))
}

fun strStr(haystack: String, needle: String): Int {
    return if (needle == "")
        0
    else
        haystack.indexOf(needle)
}