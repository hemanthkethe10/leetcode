fun main() {
println(repeatedNTimes(intArrayOf(2,1,2,5,3,2)))
}

fun repeatedNTimes(A: IntArray):Int {
 return A.toList().groupingBy { it }.eachCount().filter { (_,value)->value>1  }.keys.first()

}