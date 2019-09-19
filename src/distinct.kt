
import java.util.*

fun main() {
    val list = "abbaca"
    val stack = Stack<Char>()
    val c=list.mapIndexed { index, c ->
        if (index == 0) {
            stack.push(c)
        } else if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop()
        } else
            stack.push(c)
    }
    println(stack.joinToString(separator = ""))
}

