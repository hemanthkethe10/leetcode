import java.lang.Exception

fun main() {
    println(singleNumber(intArrayOf(1,2,2,3,3)))
    println(singleNumberMap(intArrayOf(1,2,3,4)))
}

fun singleNumber(nums: IntArray): Int {
    val totalCount = nums.toSet().fold(0) { acc, i -> acc + i } * 2
    val givenListCount = nums.fold(0) { acc, i -> acc + i }
    return totalCount - givenListCount
}

fun singleNumberMap(nums: IntArray): Int {
    val map = nums.toList().joinToString(separator = "")
        .groupingBy { it }.eachCount()
        .filter { (_, v) -> v <= 1 }.keys
    return try {
        map.first().toInt() - 48
    } catch (e: Exception) {
        0
    }
}