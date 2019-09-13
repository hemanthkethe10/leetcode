fun main() {
    println(arrayPairSum(intArrayOf(4, 3, 2, 1)))
    println(diStringMatch("III"))
}

fun arrayPairSum(nums: IntArray): Int {
//    println(nums.toList().sorted().filterIndexed { index, _ -> index % 2 == 0 })
    return nums.sorted().filterIndexed { index, _ -> index % 2 == 0 }.sum()
}

fun diStringMatch(S: String): IntArray {
    val farItr = (0..S.length / 2).iterator()
    val backItr = (S.length downTo S.length / 2).iterator()
    return when {
        S.toSet() == setOf('I') -> (0..S.length).sorted()
            .toIntArray()
        S.toSet() == setOf('D') -> (0..S.length).sortedDescending()
            .toIntArray()
        else -> {
            val middleList = S.map { c ->
                if (c == 'I') {
                    farItr.nextInt()
                } else {
                    backItr.nextInt()
                }
            }
            return middleList.plus((S.length * (S.length + 1) / 2) - middleList.sum())
                .toIntArray()
        }
    }

}
