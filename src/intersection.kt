fun main() {
    println(intersection(intArrayOf(1, 2), intArrayOf(1,1)))
}

fun intersection(nums1: IntArray, nums2: IntArray):IntArray {
    return if (nums1.isEmpty() || nums2.isEmpty()) {
        emptyList<Int>().toIntArray()
    } else {
        if (nums1.size > nums2.size) {
            val intersectedArray = nums2.toSet().fold(emptyList<Int>()) { acc, i ->
                if (nums1.contains(i)) acc.plus(i) else acc
            }
            intersectedArray.toIntArray()
        }
        else{
            val intersectedArray = nums1.toSet().fold(emptyList<Int>()) { acc, i ->
                if (nums2.contains(i)) acc.plus(i) else acc
            }
            intersectedArray.toSet().toIntArray()
        }
    }
}