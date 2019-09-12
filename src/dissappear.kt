fun main() {
    println(findDisappearedNumbers(intArrayOf(1,1)))
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    return if (nums.isEmpty()) {
        emptyList()
    } else {
        val haveList = (1..nums.size).toList()
        val numsSet = nums.toSet().sorted()
//    val dissapearedList=haveList.fold(emptyList<Int>())
//    {
//        acc, i ->  numsSet.fold(emptyList<Int>()){
//        accInner, iInner ->  if (i==iInner)  acc else accInner.plus(i)
//    }
//    }
//    println(dissapearedList)
        haveList - numsSet
    }
}
