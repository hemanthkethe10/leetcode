
fun main() {
    println(hammingDistance(4, 1))
    println(peakIndexInMountainArray(intArrayOf(0,2,1,0)))
}

fun hammingDistance(x: Int, y: Int) {
    val xDec = decToBin(x).reversed()
    val yDec=decToBin(y).reversed()
    val xLength=xDec.length -yDec.length
    val yLength=yDec.length-xDec.length
    val xDec4=if (xLength < 0) "0".repeat(xLength.unaryMinus())+xDec  else xDec
    val yDec4=if (yLength < 0) "0".repeat(yLength.unaryMinus())+yDec  else yDec
    println(xDec4.toList().zip(yDec4.toList()).filter { it.first != it.second }.size)
}

tailrec fun decToBin(num: Int, str: String = ""): String {
    return if (num == 0)
        str
    else {
        decToBin(num / 2, str + "${num % 2}")
    }
}

fun peakIndexInMountainArray(A: IntArray): Int {
return A.indexOf(A.max()!!)
}
