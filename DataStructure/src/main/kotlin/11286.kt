import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.abs
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val arr = PriorityQueue<Int> { o1, o2 ->
        when {
            abs(o1) > abs(o2) -> 1
            abs(o2) > abs(o1) -> -1
            else -> when {
                o1 > o2 -> 1
                o2 > o1 -> -1
                else -> 0
            }
        }
    }

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