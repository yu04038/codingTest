import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    var number = br.readLine().toInt()
    var sum = 0L

    val arr = Array(1001){ Array(1001) {0L} }

    // 모든 행의 첫번째 수는 1
    for (i in arr.indices) {
        arr[i][0] = 1L
    }

    for (i in 1 until arr.size) {
        for (j in 1 .. i) {
            arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j] % 10007
        }
    }

    if (number % 2 == 1) {
        for (i in number downTo  number / 2 + 1 ) {
            sum += arr[i][number - i]
        }
    } else {
        for (i in number downTo  number / 2) {
            sum += arr[i][number - i]
        }
    }
    println(sum % 10007)
}