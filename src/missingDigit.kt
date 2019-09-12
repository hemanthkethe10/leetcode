fun main() {
    println(missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}

fun missingNumber(nums: IntArray): Int {
    val nElementSum=(0..nums.size).fold(0){acc, i -> acc+i }
    val givenListSum=nums.fold(0){acc, i -> acc+i }
    return nElementSum-givenListSum
}