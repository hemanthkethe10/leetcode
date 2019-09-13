fun main() {
    println(containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
}

fun containsDuplicate(nums: IntArray): Boolean {
return nums.size != nums.toSet().size
}