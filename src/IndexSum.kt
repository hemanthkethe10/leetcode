fun main() {
    println(twoSum(intArrayOf(3, 2, 4), 6))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    return nums.foldIndexed(intArrayOf())
    { index, acc, i ->
        if (nums.drop(index).contains(target - i)) {
           return acc + index + nums.lastIndexOf(target - i)
        } else acc
    }


}