import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = StringTokenizer(br.readLine())

    val first = number.nextToken().toInt()
    val second = number.nextToken().toInt()

    println(factorial11050(first) / factorial11050(second) / factorial11050(first-second))

}

fun factorial11050(number: Int): Int {
    return if (number == 0) {
        1
    } else {
        number * factorial11050(number - 1)
    }
}