import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    var k = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = LinkedList<Int>()
    val stack1 = LinkedList<Int>()
    val stack2 = LinkedList<Int>()
    var count = 2
    var answer = mutableListOf<String>()

    for (i in 0 until k) {
        val number = StringTokenizer(br.readLine()).nextToken().toInt()
        arr.add(number)
    }
    stack1.add(1)
    answer += "+"

    while (stack2.size != k) {
        if (stack1.size >= 1) {
            if (stack1.last == arr.first) {
                arr.removeFirst()
                stack2.add(stack1.removeLast())
                answer += "-"
            } else {
                if (count > k) {
                    answer += "NO"
                    break
                } else {
                    stack1.add(count)
                    answer += "+"
                    count += 1
                }
            }
        } else {
            if (count > k) {
                answer += "NO"
                break
            } else {
                stack1.add(count)
                answer += "+"
                count += 1
            }
        }
    }
    if (answer.contains("NO")) {
        println("NO")
    } else {
        for (i in answer) {
            println(i)
        }
    }
}