import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val number = StringTokenizer(br.readLine())!!.nextToken().toLong()
    var counting = 0L
    var a = 1L

    while (counting != number) {
        if (a.toString().contains("666")) {
            counting += 1
        }
        a += 1
    }
    println(a - 1)
}