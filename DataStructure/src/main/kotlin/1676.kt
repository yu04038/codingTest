import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toLong()
    var factorial = BigInteger("1")
    var count = 0

    for (i in 0L until n) {
        factorial = factorial.multiply(BigInteger.valueOf(i + 1))
    }

    for (j in factorial.toString().length - 1 downTo 0) {
        if (factorial.toString()[j] == '0') {
            count += 1
        } else {
            println(count)
            break
        }
    }
}