import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    var dudbojab = StringTokenizer(br.readLine())
    var n = dudbojab.nextToken().toInt()
    var m = dudbojab.nextToken().toInt()
    var count = 0

    var map = HashMap<String, Int>()

    for (i in 0 until n + m) {
        var name = StringTokenizer(br.readLine()).nextToken()
        map[name] = map.getOrDefault(name, 0) + 1
    }

    println(map.count{ it.value > 1})
    for (i in map.toSortedMap().filter { it.value > 1 }) {
        println(i.key)
    }
}