fun main() {
println(removeDuplicates("abbaca"))
}

fun removeDuplicates(S: String): String {
    return S.toList().fold (emptyList<Char>())
    { result, value ->
        if (result.isNotEmpty() && result.last() == value) result
        else result + value
    }.toString()
}