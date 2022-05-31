import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val inventory = StringTokenizer(br.readLine())
    val n = inventory.nextToken().toInt()
    val m = inventory.nextToken().toInt()
    val b = inventory.nextToken().toLong()

    val arr = mutableListOf<Int>()
    var seconds = HashMap<Int, Int>()

    for (i in 0 until n) {
        val area = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            val height = area.nextToken().toInt()
            arr.add(height)
        }
    }

    for (i in 0 ..arr.maxOrNull()!!) {
        var blocks = b
        var second = 0

        for (j in arr) {
            if (i > j) {
                second += i - j
                blocks -= (i - j)
            } else {
                second += (j - i) * 2
                blocks += (j - i)
            }
        }

        if (blocks >= 0) {
            seconds[second] = i
        }
    }
    val secondsFilter = seconds.filter { it.key == seconds.minOf { it.key }}

    if (secondsFilter.size > 1) {
        println("${secondsFilter.toList().last().first} ${secondsFilter.toList().last().second}")
    } else {
        println("${secondsFilter.toList().first().first} ${secondsFilter.toList().first().second}")
    }
}