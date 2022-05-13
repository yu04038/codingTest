import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val string = StringTokenizer(br.readLine()!!).nextToken()
    val number = StringTokenizer(br.readLine())!!.nextToken().toInt()
    val linkedList: LinkedList<String> = LinkedList()

    for (alphabet in string) {
        linkedList.add(alphabet.toString())
    }
    val cursor = linkedList.listIterator(string.length)

    for (num in 0 until number) {
        var command = StringTokenizer(br.readLine())

        when (command.nextToken()) {
            "P" -> {
                cursor.add(command.nextToken())
            }
            "D" -> {
                if (cursor.hasNext()) {
                    cursor.next()
                }
            }
            "L" -> {
                if (cursor.hasPrevious()) {
                    cursor.previous()
                }
            }
            "B" -> {
                if (cursor.hasPrevious()) {
                    cursor.previous()
                    cursor.remove()
                }
            }
        }
    }

    for (i in linkedList) {
        bw.write(i)
    }
    bw.flush()
    bw.close()
}