import java.lang.Exception

fun main() {
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 1, 1,1)))
}

fun majorityElement(nums: IntArray): Int {
    val setList = nums.toSet()
    val countList = setList.map { l -> nums.filter { it == l } }.map { it.size }
    return try {
        setList.zip(countList).first { it.second > nums.size / 2 }.first
    }catch (e:Exception){
        return 0
    }
}