import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val queue = LinkedList<Int>()

    for (i in 1 .. number){
        queue.add(i)
    }

    while (queue.size != 1) {
        queue.pop()
        queue.add(queue.pop())
    }

    println(queue[0])
}