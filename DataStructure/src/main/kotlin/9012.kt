import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine()).nextToken().toInt()

    for (num in 0 until number) {
        var brace = StringTokenizer(br.readLine()).nextToken()
        val stack = LinkedList<Char>()

        for (i in brace) {
            when (i) {
                '(' -> stack.add('(')
                ')' -> {
                    if (stack.size == 0) {
                        stack.add(')')
                    }
                    if (stack.last == '(') {
                        stack.removeLast()
                    } else {
                        stack.add('(')
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}