import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    var count = 0

    for (i in 0 until number) {
        var constructor = i.toString()
        var sum = i

        for (j in constructor) {
            sum += j.toString().toInt()
        }

        if (sum == number) {
            println(i)
            break
        } else {
            count += 1
        }
    }

    if (count == number) {
        println("0")
    }
}