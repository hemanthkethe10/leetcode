fun main() {
    println(isHappy(11111))
}

fun isHappy(num: Int): Boolean{
    return checkHappy(num)==1
}

fun checkHappy(num:Int):Int{
    return when{
        (num==1)-> num
        listOf(2,3,4,5,6,8,9).contains(num) -> 0
        else -> checkHappy(num.toString().fold(0)
        { acc, c -> acc + (c.toInt() - 48) * (c.toInt() - 48) })
    }
}