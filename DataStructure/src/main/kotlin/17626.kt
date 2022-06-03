import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    var number = br.readLine().toInt()
    var count = 0

    val arr = Array(223){0}
    for (i in arr.indices) {
        arr[i] = i * i
    }

    println(floor(sqrt(number.toDouble())).toInt())
}