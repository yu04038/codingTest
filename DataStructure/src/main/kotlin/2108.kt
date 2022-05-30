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
    var sum = 0.0

    for (i in 0 until number){
        var number = br.readLine().toInt()
        arr.add(number)
        map[number] = map.getOrDefault(number, 0) + 1
        sum += number
    }

    var mapSortFirst = map.toList().sortedBy { it.first }.toMap()
    var max = map.toList().sortedBy { it.second }.toMap().maxByOrNull { it.value }!!.value
    var mapSortFirstFilter = mapSortFirst.filter { it.value == max }

    arr.sort()
    // 산술 평균
    println(round(sum / arr.size).toInt())

    // 중앙값
    println(arr[number / 2])

    // 최빈값
    if (mapSortFirstFilter.size > 1) {
        println(mapSortFirstFilter.toList()[1].first)
    } else {
        println(mapSortFirstFilter.toList()[0].first)
    }

    // 범위
    println(arr.last() - arr.first())
}