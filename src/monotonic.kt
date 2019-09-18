fun main() {
    println(isMonotonic(intArrayOf(6,3,2,1,7)))
}

fun isMonotonic(A: IntArray): Boolean {
//  return A.sortedArray()==A || A.sortedArrayDescending()==A
    return A.toList().sorted()==A.toList() || A.toList().sortedDescending()==A.toList()
}