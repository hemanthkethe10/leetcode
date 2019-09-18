import kotlin.math.pow

fun main() {
    println(findComplement(5))
}

fun findComplement(num: Int):Int {
    val numBin = decToBin(num, "").reversed()
    println(numBin)
    val compliment=numBin.map { if (it == '1') '0' else '1' }.joinToString(separator = "")
    println(compliment)
    return bintoDec1(compliment)
}

fun bintoDec1(str:String):Int{
    val a=0..100
    val itr= a.iterator()
    return str.toList()
        .reversed()
        .map { it.toLong()-48 }
        .fold(0,{
                acc, i -> (acc+i* 2.0.pow(itr.next().toDouble())).toInt()
        })
}