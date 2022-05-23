import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    var firstLine = StringTokenizer(br.readLine())
    var n = firstLine.nextToken().toInt()
    var m = firstLine.nextToken().toInt()
    var queue = LinkedList<Int>()
    var secondLine = StringTokenizer(br.readLine())

    var count = 0

    for (i in 1..n) {
        queue.add(i)
    }

    for (i in 0 until m) {
        val element = secondLine.nextToken().toInt()
        if (element == queue.first) {
            queue.removeFirst()
        } else {
            while (element != queue.first) {
                count += if (queue.indexOf(element) <= (queue.size / 2)) {
                    queue.addLast(queue.removeFirst())
                    1
                } else {
                    queue.addFirst(queue.removeLast())
                    1
                }
            }
            queue.removeFirst()
        }
    }
    println(count)
}