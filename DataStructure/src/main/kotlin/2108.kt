import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableListOf<Int>()
    val map = HashMap<Int, Int>()
    var sum = 0

    for (i in 0 until number){
        var number = br.readLine().toInt()
        arr.add(number)
        map[number] = map.getOrDefault(number, 0) + 1
        sum += number
    }

    arr.sort()
    println(arr[number / 2])
    println(arr.last() - arr.first())
}