fun main() {
    val str= "(()())(())(()(()))"
    removeOuterParentheses(str)
}

fun removeOuterParentheses(S: String) {
val parenthesisList=S.toList().map { if (it=='(') 1 else -1}
    val finalList= parenthesisList.mapIndexed { index, i ->
        val k=parenthesisList.take(index+1)
        val count=sum(k)
        when (index) {
            0 -> i
            else -> count
        }
    }
    println(finalList)
    val substr=finalList.joinToString()
        .replace(" ","")
        .replace(",","").split("0")
        .map { it.drop(1  ) }
    println(substr)
}

fun sum(list:List<Int>):Int{
   return list.fold(0){acc, i ->acc+i  }
}
