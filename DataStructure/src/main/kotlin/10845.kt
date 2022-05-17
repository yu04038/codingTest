import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val queue = LinkedList<Int>()
    var k = StringTokenizer(br.readLine()).nextToken().toInt()

    for(i in 0 until k) {
        var tmp = StringTokenizer(br.readLine())

        when(tmp.nextToken()) {
            "push" -> {
                queue.add(tmp.nextToken().toInt())
            }

            "pop" -> {
                if (queue.isEmpty()) bw.write("-1") else bw.write(queue.pop().toString())
                bw.newLine()
            }

            "size" -> {
                bw.write(queue.size.toString())
                bw.newLine()
            }

            "empty" -> {
                if (queue.isEmpty()) bw.write("1") else bw.write("0")
                bw.newLine()
            }

            "front" -> {
                if (queue.isEmpty()) bw.write("-1") else bw.write(queue.first.toString())
                bw.newLine()
            }

            "back" -> {
                if (queue.isEmpty()) bw.write("-1") else bw.write(queue.last.toString())
                bw.newLine()
            }
        }
    }
    bw.flush()
    bw.close()
}
