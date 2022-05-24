import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val number = StringTokenizer(br.readLine()).nextToken().toInt()
    val arr = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until number) {
        val point = StringTokenizer(br.readLine())
        arr.add(Pair(point.nextToken().toInt(), point.nextToken().toInt()))
    }

    val sort = arr.sortedWith( compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })

    for (i in sort) {
        println("${i.first} ${i.second}")
    }
}