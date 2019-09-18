fun main() {
    println(findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 2), 4))
}

fun findMaxAverage(nums: IntArray, k: Int): Double {
    when {
        nums.size <= k -> return 0.0
        k == 1 -> return nums.max()!!.toDouble()
        else -> {
            val cumulativeSum = nums.foldIndexed(emptyList<Int>())
            { idx, acc, i ->
                if (idx == 0) acc.plus(i) else acc.plus(i + acc[idx - 1])
            }
            return (1..(nums.size - k + 1)).foldIndexed(0) { idx, acc, _ ->
                when {
                    idx == 0 -> acc + cumulativeSum[idx + (k - 1)]
                    cumulativeSum[idx + (k - 1)] - cumulativeSum[idx - 1] > acc ->
                        cumulativeSum[idx + (k - 1)] - cumulativeSum[idx - 1]
                    else -> acc
                }
            } / k.toDouble()
//            return (1..(nums.size - k +1)).foldIndexed(emptyList<Int>()) { idx, acc, _ ->
//                if (idx == 0)
//                    acc.plus(iSum[idx + (k-1)])
//                else
//                    acc.plus(iSum[idx + (k-1)] - iSum[idx - 1])
//            }.max()!!.toDouble()/k.toDouble()
        }
    }
}