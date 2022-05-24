import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableSetOf<String>()

    for (i in 0 until number) {
        val string = StringTokenizer(br.readLine()).nextToken()
        arr.add(string)
    }

    val length = arr.sortedWith( compareBy<String> { it.length }.thenBy { it })

    for (i in length) {
        println(i)
    }
}
