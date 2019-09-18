fun main() {
    println(findOcurrences("alice is a good girl she is a good student"
        ,"a","good"))
}

fun findOcurrences(text: String, first: String, second: String) {
println(text.split(first+"\t"+second))
}