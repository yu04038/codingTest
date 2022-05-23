import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        var case = StringTokenizer(br.readLine())

        val a = case.nextToken().toInt()
        val b = case.nextToken().toInt()
        val c = case.nextToken().toInt()
        val arr = mutableListOf<Int>()
        arr.add(a)
        arr.add(b)
        arr.add(c)

        val arr2 = arr.sorted()

        if (a == 0) {
            break
        }

        if (arr2[0] * arr2[0] + arr2[1] * arr2[1] == arr2[2] * arr2[2]) {
            println("right")
        } else {
            println("wrong")
        }
    }
}