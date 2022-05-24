import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableListOf<Pair<Int, Int>>()

    for (num in 0 until number) {
        var person = StringTokenizer(br.readLine())
        var weight = person.nextToken().toInt()
        var height = person.nextToken().toInt()
        arr.add(Pair(weight, height))
    }

    for (i in arr) {
        var count = 1
        for (j in arr) {
            if (i.first < j.first && i.second < j.second) {
                count += 1
            }
        }
        print("$count ")
    }
}