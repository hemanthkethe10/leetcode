fun main() {
    println(twoSumSorted(intArrayOf(0, 0, 3, 4), 0))
}

fun twoSumSorted(nums: IntArray, target: Int): IntArray {
    val requiredList = nums.foldIndexed(emptyList<Int>())
    { index, acc, i ->
        if (nums.drop(index + 1).contains(target - i)) {
            acc.plus(listOf(i, target - i))

        } else acc
    }
    val returnList = requiredList.map { nums.indexOf(it) + 1 }
    if (returnList.first() == returnList.last())
        return returnList.mapIndexed { index, i -> if (index == returnList.size - 1) i + 1 else i }.toIntArray()
    else
        return returnList.toIntArray()
}