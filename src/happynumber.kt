fun main() {
println(isHappy(19))
}

fun isHappy(n: Int): Boolean {
if (n==1){
    return true}
    else{
       val numberString=n.toString().fold(0){acc, c -> acc+(c.toInt()-48 * c.toInt()-48) }
    return isHappy(numberString)
    }
}