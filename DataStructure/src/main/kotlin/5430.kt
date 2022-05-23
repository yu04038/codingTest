import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val number = StringTokenizer(br.readLine()).nextToken().toInt()

    for (num in 0 until number) {
        println(solution())
    }
}

fun solution(): String {
    val deque = LinkedList<String>()
    var commands = StringTokenizer(br.readLine()).nextToken()
    var length = StringTokenizer(br.readLine()).nextToken().toInt()
    var reverse = true
    var arr = br.readLine().drop(1).dropLast(1).split(",").toMutableList()
    deque.addAll(arr)

    if (length < commands.count { c -> c == 'D' }) return "error"

    for (command in commands) {
        when (command) {
            'R' -> {
                reverse = !reverse
            }
            'D' -> {
                if (reverse) {
                    deque.removeFirst()
                } else {
                    deque.removeLast()
                }
            }
        }
    }

    return if (reverse) {
            "[${deque.joinToString(",") { it }}]"
        } else {
            "[${deque.reversed().joinToString(",") { it }}]"
        }
}