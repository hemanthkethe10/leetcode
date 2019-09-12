fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.indexOf(target) == -1) {
        try {
            val alternateTarget = nums.filter { it > target }.last()
            return nums.indexOf(alternateTarget) + 1
        } catch (e: Exception) {
            return 0
        }
    } else
        return nums.indexOf(target)
}