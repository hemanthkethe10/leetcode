import java.util.*

fun main() {
   println(relativeSortArray(listOf(2,3,1,3,2,4,6,7,9,2,19), listOf(2,1,4,3,9,6)))
}

fun relativeSortArray(arr1: List<Int>, arr2: List<Int>): List<Int> {
    Collections.sort(arr1) { x, y->arr2.indexOf(x)-arr2.indexOf(y) }
    val noList=arr1.takeWhile { !arr2.contains(it) }
    return arr1.drop(noList.size)+noList.sorted()
}