import java.math.BigInteger

fun main() {
    rotate(intArrayOf(1,2,3,4,5,6,7),3)
}

fun rotate(nums: IntArray, k: Int): Unit {
    if (nums.size < 3) {
      println(nums.toMutableList())
    } else {
        println((0..k).fold(emptyList<Int>()){
            acc,i-> acc.plus(nums.elementAt(nums.size-1))+nums.toMutableList().take(nums.size-1)
        })
        }
//        val shiftedList = nums.drop(nums.size - k)
//        println(shiftedList + nums.take(nums.size - k))
    }
