import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = br.readLine().toInt()

    for (i in 0 until number) {
        var document = StringTokenizer(br.readLine())
        var documentNumber = document.nextToken().toInt()
        var documentLocation = document.nextToken().toInt()
        var queue = LinkedList<Int>()

        var importance = StringTokenizer(br.readLine())

        for (j in 0 until documentNumber) {
            queue.add(importance.nextToken().toInt())
        }

        calculate(queue, documentLocation)
    }
}

fun calculate(queue: LinkedList<Int>, documentLocation: Int) {
    var index = documentLocation
    var order = 0

    while (queue.size != 0) {
        var count = 0
        for (i in queue) {
            if (i > queue.first) {
                count += 1
            }
        }
        if (queue.size > 1) {
            if (count != 0) {
                queue.addLast(queue.first)
                queue.removeFirst()
                if (index == 0) {
                    index = queue.size - 1
                } else {
                    index -= 1
                }
            } else {
                queue.removeFirst()
                order += 1
                if (index == 0) {
                    println(order)
                    break
                } else {
                    index -= 1
                }
            }
        } else {
            order += 1
            println(order)
            queue.removeFirst()
        }
    }
}