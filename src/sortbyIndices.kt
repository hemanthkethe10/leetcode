fun main() {
    println(sortArrayByParityII(intArrayOf(4, 2, 5, 7)))
}

fun sortArrayByParityII(A: IntArray):IntArray{
    val (even, odd) = A.partition { it % 2 == 0 }
    println(even)
    val evenItr=even.iterator()
    val oddItr=odd.iterator()
    return (A.indices).fold(emptyList<Int>()){
        acc, i -> if (i%2==0) acc.plus(evenItr.next()) else acc.plus(oddItr.next())

    }.toIntArray()
}