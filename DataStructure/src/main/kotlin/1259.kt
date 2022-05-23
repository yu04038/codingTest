import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val string = StringTokenizer(br.readLine()).nextToken()
        val arr = mutableListOf<String>()
        for (alphabet in string ) {
            arr.add(alphabet.toString())
        }

        if (string == "0") {
            break
        } else {
            if (arr.reversed() == arr) {
                println("yes")
            } else {
                println("no")
            }
        }
    }
}