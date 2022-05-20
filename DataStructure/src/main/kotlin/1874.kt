import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var k = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableListOf<Int>()
    val stack = mutableListOf<Int>()
    var a = 1

    for (i in 0 until k) {
        var number = StringTokenizer(br.readLine()).nextToken().toInt()
        arr.add(number)
        stack.add(i + 1)
    }

    for (i in arr) {
        if (a <= i) {
            println("+")
            stack.add(a)
            a += 1
        }
    }

}