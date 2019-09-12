fun main() {
    moveZeroes(intArrayOf(0, 1, 0, 0, 100, 3, 12, -1, 23))
}

fun moveZeroes(nums: IntArray): Unit {
    val nonZeroList = nums.filter { it != 0 }
    println(nonZeroList + List(nums.size - nonZeroList.size) { 0 })
}