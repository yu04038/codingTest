import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableListOf<Pair<Int, String>>()

    for (i in 0 until number) {
        var people = StringTokenizer(br.readLine())
        var age = people.nextToken().toInt()
        var name = people.nextToken()

        arr.add(Pair(age, name))
    }
    arr.sortWith(compareBy { it.first })

    for (j in arr) {
        println("${j.first} ${j.second}")
    }
}