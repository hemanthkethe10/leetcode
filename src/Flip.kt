fun main() {
    println(
        flipAndInvertImage(
            arrayOf(
                arrayOf(1, 1, 0).toIntArray(),
                arrayOf(1, 0, 1).toIntArray(), arrayOf(0, 0, 0).toIntArray()
            )
        )
    )
}

fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
    val arrayList = A.map { it.reversed() }.map {
        it
            .map { if (it == 0) 1 else 0 }.toIntArray()
    }
    return arrayList.toTypedArray()
}