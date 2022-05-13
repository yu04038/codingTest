import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine())!!.nextToken().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (num in 0 until number) {
        var commands = StringTokenizer(br.readLine()).nextToken()
        val linkedList: LinkedList<String> = LinkedList()
        val cursor = linkedList.listIterator()

        for (command in commands) {
            when(command.toString()) {
                "<" -> {
                    if (cursor.hasPrevious()) {
                        cursor.previous()
                    }
                }
                ">" -> {
                    if (cursor.hasNext()) {
                        cursor.next()
                    }
                }
                "-" -> {
                    if (cursor.hasPrevious()) {
                        cursor.previous()
                        cursor.remove()
                    }
                }
                else -> cursor.add(command.toString())
            }
        }

        for (i in linkedList) {
            bw.write(i)
        }
        bw.newLine()
        bw.flush()
    }
}