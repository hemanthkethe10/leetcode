import kotlin.math.absoluteValue

fun main() {
    println(findPairs(intArrayOf(-1,-2,-3), 1))
}

fun findPairs(nums: IntArray, k: Int):Int {
    return when {
        k<0 -> 0
        else -> {
            val i = nums.mapIndexed { index,l ->
                nums.filterIndexed { idx, i -> idx!= index }.map {  s->
                    if (l - s == k ) l to s else Int.MAX_VALUE to Int.MAX_VALUE }
            }.flatten()
            i.filter { it.first !=Int.MAX_VALUE }.toSet().size
//            val i=nums.foldIndexed(emptyList<Pair<Int,Int>>())
//            {index, acc, i -> nums.drop(index+1).map { l ->  } }
        }
    }
}