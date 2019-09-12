fun main() {
    println(removeDuplicates(intArrayOf(1,1,2)))
}

fun removeDuplicates(nums: IntArray):Int{
    val new=nums.toSet()
    return new.size
}