fun main() {
    println(isBoomerang(arrayOf(intArrayOf(1, 1), intArrayOf(2, 3), intArrayOf(2,3))))
}

fun isBoomerang(points: Array<IntArray>):Boolean {
    val pointsPair = points.map { it.first() to it.last() }
    return if (pointsPair.toSet().size < points.size) {
        false
    } else {
        val xPoint = pointsPair.map { it.first }
        val yPoint = pointsPair.map { it.second }
        return !(xPoint.toSet().size < xPoint.size - 1 || xPoint == yPoint || yPoint.toSet().size < yPoint.size - 1)
    }
}