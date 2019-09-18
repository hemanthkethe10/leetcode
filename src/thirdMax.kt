fun main() {
    println(thirdMax(intArrayOf(2,2,1)))
}

fun thirdMax(nums: IntArray):Int{
    return if (nums.toSet().size < 3){
        nums.max()!!
    }
    else{
        val nonRepeatedList=nums.sorted().toSet().toList()
       nums.sorted().toSet().toList()[nonRepeatedList.size-3]
    }
}