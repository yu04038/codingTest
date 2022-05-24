import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = StringTokenizer(br.readLine()).nextToken().toInt()
    val map = HashMap<Int, Int>()
    val nList = StringTokenizer(br.readLine())

    for (i in 0 until n) {
        val num = nList.nextToken().toInt()
        map[num] = map.getOrDefault(num, 0) + 1
    }

    val m = StringTokenizer(br.readLine()).nextToken().toInt()
    val mList = StringTokenizer(br.readLine())

    for (i in 0 until m) {
        val num = mList.nextToken().toInt()

        if (map.keys.contains(num)) {
            bw.write(map[num].toString() + " ")
        } else {
            bw.write("0 ")
        }
    }
    bw.flush()
    bw.close()
}