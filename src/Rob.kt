import kotlin.math.max

fun main() {
    println(rob(intArrayOf(1, 2, 3, 1)))
}

fun rob(nums: IntArray):Int {
    return if (nums.size == 1)
        nums.first()
    else {
        val evenList = nums.filterIndexed { index, _ -> index % 2 == 0 }
        val oddList = nums.filterIndexed { index, _ -> index % 2 != 0 }
        max(evenList.sum(), oddList.sum())
    }
}