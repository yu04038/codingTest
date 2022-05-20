import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.*

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = StringTokenizer(br.readLine())

    val first = number.nextToken().toInt()
    val second = number.nextToken().toInt()

    println(gcd(first,second))
    println(lcm(first,second))
}

fun lcm(a:Int, b:Int):Int {
    return ((a * b) / gcd(a, b))
}

fun gcd(a: Int, b: Int): Int {
    var maximum = max(a, b)
    var minimum = min(a, b)

    return if (minimum == 0) {
        max(a, b)
    } else {
        gcd(minimum, maximum % minimum)
    }
}