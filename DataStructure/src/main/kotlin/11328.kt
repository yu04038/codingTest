import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(Scanner(System. `in`)){

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    var arr = mutableListOf<Pair<String, String>>()

    for(i in 0 until n) {
        val st1 = StringTokenizer(br.readLine())
        val a =  st1.nextToken()
        val b =  st1.nextToken()

        arr.add(Pair(a, b))
    }

    for (i in arr) {
        if (i.first.toCharArray().sorted() == i.second.toCharArray().sorted()) {
            println("Possible")
        } else {
            println("Impossible")
        }
    }
}