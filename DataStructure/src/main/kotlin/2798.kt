import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val card = StringTokenizer(br.readLine())
    val n = card.nextToken().toInt()
    val m = card.nextToken().toInt()

    val cards = StringTokenizer(br.readLine())
    val arr = mutableListOf<Int>()
    var answer = 0

    for (i in 0 until n) {
        arr.add(cards.nextToken().toInt())
    }

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            for (k in j + 1 until arr.size) {
                if (arr[i] + arr[j] + arr[k] <= m) {
                    if (answer < arr[i] + arr[j] + arr[k]) {
                        answer = arr[i] + arr[j] + arr[k]
                    }
                }
            }
        }
    }
    println(answer)
}