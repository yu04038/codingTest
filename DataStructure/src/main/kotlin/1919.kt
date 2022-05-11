import kotlin.math.*
import java.util.*
import kotlin.collections.HashMap

fun main() = with(Scanner(System. `in`)){

    var first = readLine()!!
    var second = readLine()!!
    var mapFirst = HashMap<Char, Int>()
    var mapSecond = HashMap<Char, Int>()
    var count = 0

    for (i in first) {
        mapFirst[i] = mapFirst.getOrDefault(i, 0) + 1
    }
    for (j in second) {
        mapSecond[j] = mapSecond.getOrDefault(j, 0) + 1
    }

    for (element in mapFirst) {
        if (mapSecond.containsKey(element.key)) {
            if (mapSecond[element.key]!! > element.value) {
                count += abs(element.value - mapSecond[element.key]!!)
            }
        } else {
            count += element.value
        }
    }

    for (element in mapSecond) {
        if (mapFirst.containsKey(element.key)) {
            if (mapFirst[element.key]!! > element.value) {
                count += abs(element.value - mapFirst[element.key]!!)
            }
        } else {
            count += element.value
        }
    }

    println(count)
}