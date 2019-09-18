fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    return if (nums.indexOf(target) == -1) {
        try {
            val alternateTarget = nums.last { it > target }
            nums.indexOf(alternateTarget) + 1
        } catch (e: Exception) {
            0
        }
    } else
        nums.indexOf(target)
}