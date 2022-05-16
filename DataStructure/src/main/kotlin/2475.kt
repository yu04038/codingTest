import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = br.readLine().split( " ")
    var sum = 0

    for (number in arr) {
        sum += number.toInt() * number.toInt()
    }

    println(sum % 10)
}