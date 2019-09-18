import kotlin.math.max

fun main() {
    println(rob(intArrayOf(1)))
}

fun rob(nums: IntArray):Int {
    return when {
         nums.isEmpty()-> 0
        nums.size == 1 -> nums[1]
        nums.size ==2 -> max(nums[0],nums[1])
        else -> {
            val dp = IntArray(nums.size)
            dp[0]=nums[0]
            dp[1]= max(nums[0],nums[1])
            (2 until nums.size).map {dp[it]= max(dp[it-1],nums[it]+dp[it-2])}
            dp[nums.size-1]
        }
    }

}
//    when {
//        nums.size == 1 -> return nums.first()
//        nums.size == 2 -> return max(nums[0], nums[1])
//        else -> {
//            val list = mutableListOf<Any>()
//            list.add(nums[0])
//            list.add(nums[1])
//            list.add((2 until nums.size).map { max(nums[it]+nums[it-2],nums[it-1]) })
//            println(list)
//        }
//    }
//
//return  1
//    {
//        val evenList = nums.filterIndexed { index, _ -> index % 2 == 0 }
//        val oddList = nums.filterIndexed { index, _ -> index % 2 != 0 }
//        max(evenList.sum(), oddList.sum())
//    }
//}