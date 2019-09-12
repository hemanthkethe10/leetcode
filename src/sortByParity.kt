fun main() {
println(sortArrayByParity(intArrayOf(3,1,2,4)))
}

fun sortArrayByParity(A: IntArray): IntArray {
val (even,odd)=A.partition { it%2==0 }
    return odd.fold(even){
        acc, i ->  acc.plus(i)
    }.toIntArray()
}