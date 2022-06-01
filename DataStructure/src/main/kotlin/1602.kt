import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var dogam = StringTokenizer(br.readLine())
    var n = dogam.nextToken().toInt()
    var m = dogam.nextToken().toInt()

    var map = HashMap<String, Int>()
    var list = mutableListOf<String>()

    for (i in 0 until n) {
        var pokemon = br.readLine()
        map[pokemon] = i + 1
        list.add(pokemon)
    }

    for (j in 0 until m) {
        var question = br.readLine()
        if (question[0].isDigit()) {
            bw.write(list[question.toInt() - 1])
            bw.newLine()
        } else {
            bw.write("${map[question]}")
            bw.newLine()
        }
    }
    bw.flush()
    bw.close()
}