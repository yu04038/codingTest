import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val chess = StringTokenizer(br.readLine())
    val bw = "BWBWBWBW"
    val wb = "WBWBWBWB"
    val n = chess.nextToken().toInt()
    val m = chess.nextToken().toInt()
    val arr = mutableListOf<String>()

    val black = mutableListOf<String>()
    val white = mutableListOf<String>()
    for (i in 0 .. 7) {
        if (i % 2 == 0) {
            black.add(bw)
            white.add(wb)
        } else {
            black.add(wb)
            white.add(bw)
        }
    }

    for (i in 0 until n) {
        var a = StringTokenizer(br.readLine()).nextToken()
        arr.add(a)
    }
}