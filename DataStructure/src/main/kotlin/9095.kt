import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val testNum = br.readLine().toInt()
    val arr = Array(11) { 0 }

    arr[0] = 1
    arr[1] = 2
    arr[2] = 4

    for (i in 3 until 11) {
        arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1]
    }

    for (i in 0 until testNum) {
        val test = br.readLine().toInt()
        println(arr[test - 1])
    }
}