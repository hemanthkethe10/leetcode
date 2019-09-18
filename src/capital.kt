fun main() {
    println(detectCapitalUse("mL"))
}

fun detectCapitalUse(word: String): Boolean {
//   return word.all { it.toInt()>=65 || it.toInt()<=90 } ||
//         (word[0].toInt() >=65 || word[0].toInt()<=90)&&
//           (word.drop(1).all { it.toInt()>=65 || it.toInt()<=90 } || word.drop(1).all { it.toInt()>=97 || it.toInt()<=122 }) ||
//             word.all { it.toInt()>=97 || it.toInt()<=122 }
    return when {
        word.all {(65..90).contains(it.toInt()) } -> true
        word.all { (97..122).contains(it.toInt()) } -> true
        (65..90).contains(word[0].toInt()) -> ((word.drop(1).all { (65..90).contains(it.toInt())})
                || (word.drop(1).all { (97..122).contains(it.toInt())}))
        else -> false
    }
}