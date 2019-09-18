fun main() {
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    println(getSum(4, -1))
}

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.size != nums.toSet().size
}

fun getSum(a: Int, b: Int): Int {
    return if (a.toString().startsWith("-") && b.toString().startsWith("-")) {
        List(a.unaryMinus()) { -1 }.plus(List(b.unaryMinus()) { -1 }).sum()
    } else if (a.toString().startsWith("-")) {
        List(a.unaryMinus()) { -1 }.plus(List(b) { 1 }).sum()
    } else if (b.toString().startsWith("-")) {
        List(a) { 1 }.plus(List(b.unaryMinus()) { -1 }).sum()
    } else {
        val alist = List(a) { 0 }
        val bList = List(b) { 0 }
        alist.plus(bList).size
    }
}