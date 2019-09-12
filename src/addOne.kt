fun main() {
    println(plusOne(intArrayOf(9,8,9)))
}

fun plusOne(digits: IntArray):IntArray {
    if (digits.toSet()== setOf(9)) {
        println(listOf(1)+ List(digits.size){0})
        return listOf(1).toIntArray() + List(digits.size) { 0 }.toIntArray()
    }
    else {
        return if (digits.last() != 9) {
            digits.mapIndexed { index, i ->
                if (index == digits.size - 1) i + 1 else i
            }.toIntArray()
        } else {
            val zeroList = digits.takeLastWhile { it == 9 }
            val nonzeroList = digits.dropLast(zeroList.size)
//            println(nonzeroList.mapIndexed { index, i ->
//                if (index == nonzeroList.size - 1) i + 1 else i
//            } + List(zeroList.size) { 0 })
            nonzeroList.mapIndexed { index, i ->
                if (index == nonzeroList.size - 1) i + 1 else i
            }.toIntArray() + List(zeroList.size) { 0 }.toIntArray()
        }
    }
}