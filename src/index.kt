fun main() {
    println(strStr("hello", "lle"))
}

fun strStr(haystack: String, needle: String): Int {
    if (needle == "")
        return 0
    else
        return haystack.indexOf(needle)
}