import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val string = br.readLine().toString()
    val stack = LinkedList<String>()

    if (string.count { it == '('} == string.count { it == ')'} &&
        string.count { it == '['} == string.count { it == ']'}) {
        for (i in string) {
            when(i.toString()) {
                "(" -> {
                    stack.add("(")
                }

                "[" -> {
                    stack.add("[")
                }

                ")" -> {
                    if (!stack.isEmpty()) {
                        if (stack.last == "(") {
                            stack.removeLast()
                            stack.add("2")
                        } else {
                            if (!"[]()".contains(stack.last)) {
                                var a = stack.last.toInt() * 2
                                stack.removeLast()
                                stack.removeLast()
                                stack.add(a.toString())
                            }
                        }
                    } else {
                        stack.add(")")
                    }
                }

                "]" -> {
                    if (!stack.isEmpty()) {
                        if (stack.last == "[") {
                            stack.removeLast()
                            stack.add("3")
                        } else {
                            if (!"[]()".contains(stack.last)) {
                                var b = stack.last.toInt() * 3
                                stack.removeLast()
                                stack.removeLast()
                                stack.add(b.toString())
                            }
                        }
                    } else {
                        stack.add("]")
                    }
                }
            }
            if (stack.size > 1) {
                if (!"[]()".contains(stack.last) && !"[]()".contains(stack[stack.size - 2])) {
                    var a = stack.last.toInt()
                    var b = stack[stack.size - 2].toInt()

                    var sum = a + b
                    stack.removeLast()
                    stack.removeLast()
                    stack.add(sum.toString())
                }
            }
        }
        if (stack.size == 1 && !"[]()".contains(stack.first)) {
            println(stack.first)
        } else {
            println(0)
        }
    } else {
        println(0)
    }
}