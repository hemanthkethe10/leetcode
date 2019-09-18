fun main() {
    println(
        sumEvenAfterQueries(
            intArrayOf(1, 2, 3, 4),
            arrayOf(
                intArrayOf(1, 0),
                intArrayOf(-3, 1), intArrayOf(-4, 0), intArrayOf(2, 3)
            )
        )
    )
}

fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>):IntArray {
    return queries.map {
        val index=it[1]
        A[index]+=it[0]
    A.fold(0){acc, i -> if (i%2==0)acc+i else acc }}
        .toIntArray()
}