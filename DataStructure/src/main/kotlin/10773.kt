import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))
    var sum = 0

    var k = StringTokenizer(br.readLine()).nextToken().toInt()
    var arr = mutableListOf<Int>()

    for (i in 0 until k) {
        var number = StringTokenizer(br.readLine()).nextToken().toInt()
        if (number != 0) {
            arr.add(number)
        } else {
            arr.removeLast()
        }
    }

    for (num in arr) {
        sum += num
    }

    println(sum)

}