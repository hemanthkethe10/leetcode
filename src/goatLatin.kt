fun main() {
    println(toGoatLatin("i am hemanth"))
}

fun toGoatLatin(S: String):String {
    val wordsList = S.split(" ")
    val vowelsList= listOf('a','e','i','o','u','A','E','I','O','U')
   return wordsList.mapIndexed {idx,i -> if (vowelsList.contains(i.first())){
        i.plus("ma"+"a".repeat(idx+1))
    }
    else{
        val consonant=i.first()
        i.drop(1).plus(consonant+"ma"+"a".repeat(idx+1))
    }}.joinToString(separator = " ")
}