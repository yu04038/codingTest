import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = br.readLine().toInt()
    var count = 0

    for (i in 0 until number) {
        val string = br.readLine()
        val stack = LinkedList<String>()
        for (i in string) {
            when(i.toString()) {
                "A" -> {
                    if (!stack.isEmpty()) {
                        if (stack.last == "A") {
                            stack.removeLast()
                        } else {
                            stack.add("A")
                        }
                    } else {
                        stack.add("A")
                    }
                }

                "B" -> {
                    if (!stack.isEmpty()) {
                        if (stack.last == "B") {
                            stack.removeLast()
                        } else {
                            stack.add("B")
                        }
                    } else {
                        stack.add("B")
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            count += 1
        }
    }
    println(count)
}