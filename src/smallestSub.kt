fun main() {
    println(findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)))
}

fun findUnsortedSubarray(nums: IntArray):Int {
    val sortedList=nums.sorted()
    val pairs=nums.zip(sortedList)
    return pairs.dropWhile { it.first==it.second }.dropLastWhile { it.first==it.second }.size
}