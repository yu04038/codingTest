import java.util.*
import kotlin.collections.HashMap

fun main() = with(Scanner(System. `in`)){

    val (total, maxPeople) = readLine()!!.split(" ").map { it.toInt() }
    val map = HashMap<Pair<Int, Int>, Int>()
    var count = 0

    for (i in 0 until total) {
        val (sex, age) = readLine()!!.split(" ").map {it.toInt()}
        map[Pair(sex, age)] = map.getOrDefault(Pair(sex, age), 0) + 1
    }

    for (i in map) {
        count += if (i.value % maxPeople == 0) {
            (i.value / maxPeople)
        } else {
            (i.value / maxPeople) + 1
        }
    }
    println(count)
}