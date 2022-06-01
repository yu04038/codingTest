import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val arr = PriorityQueue<Int>()

    for (i in 0 until num) {
        val a = br.readLine().toInt()

        when (a) {
            0 -> {
                if (arr.isEmpty()) {
                    println("0")
                } else {
                    println(arr.peek())
                    arr.remove()
                }
            }
            else -> arr.add(a)
        }
    }
}