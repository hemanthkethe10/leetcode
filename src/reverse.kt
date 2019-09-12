fun main() {
   println(reverse(8463847412))
}

fun reverse(x: Long): Int {
    return when {
        x.toString().startsWith("-") -> {
           try {
               val number=x.toString().drop(1).reversed().toInt()
            number.unaryMinus()}catch (e:Exception){
               return 0
           }
        }
        else -> try {
            x.toString().reversed().toInt()
        }catch (e:Exception){
            return 0
        }
    }
}