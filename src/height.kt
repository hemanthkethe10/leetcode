fun main() {
    println(heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
}

fun heightChecker(heights: IntArray):Int {
    val sortedList = heights.sorted()
    val pairsList=sortedList.zip(heights.toList())
    return pairsList.filter { it.first != it.second }.size
}