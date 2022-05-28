import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        var a = br.readLine()
        var arr = LinkedList<Char>()

        if (a == ".") {
            break
        } else {
            for (i in a) {
                when(i) {
                    '(' -> arr.add('(')
                    ')' -> {
                        if (arr.size > 0 && arr.last == '(') {
                            arr.removeLast()
                        } else {
                            arr.add(')')
                        }
                    }
                    '[' -> arr.add('[')
                    ']' -> {
                        if (arr.size > 0 && arr.last == '[') {
                            arr.removeLast()
                        } else {
                            arr.add(']')
                        }
                    }
                }
            }
            if (arr.isEmpty()) {
                println("yes")
            } else {
                println("no")
            }
        }
    }
}