fun main() {
    println(lastStoneWeight(intArrayOf(8, 8, 8, 8, 8, 8)))
}

fun lastStoneWeight(stones: IntArray): Int {
    return when {
        stones.size == 1 -> stones[0]
        stones.isEmpty() -> return 0
        else -> {
            val sortedList = stones.sorted()
            val largeStones = sortedList.takeLast(2)
            when  {
                largeStones[0] - largeStones[1]== 0-> lastStoneWeight(sortedList.take(stones.size - 2).toIntArray())
                largeStones[0] - largeStones[1] < 0 -> lastStoneWeight(
                    sortedList.take(stones.size - 2).plus(largeStones[1] - largeStones[0]).toIntArray()
                )
                else -> lastStoneWeight(
                    sortedList.take(stones.size - 2).plus(largeStones[0] - largeStones[1]).toIntArray())
            }
        }
    }
}