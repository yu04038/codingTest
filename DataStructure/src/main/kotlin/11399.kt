import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val time = StringTokenizer(br.readLine())
    val arr = mutableListOf<Int>()

    var answer = 0
    var sum = 0

    for(i in 0 until n) {
        arr.add(time.nextToken().toInt())
    }

    for (i in arr.sorted()) {
        sum += i
        answer += sum
    }

    println(answer)
}