

fun main() {
    println(convertToTitle(703,""))
}

fun convertToTitle(n: Int,str:String) :String {
    if (n == 0) {
        return str
    } else {
        val first = n / 26
        val second = n % 26
        return convertToTitle(n/26,str+
                "${(first + 64).toChar()}${(second + 64).toChar()}")

    }
}