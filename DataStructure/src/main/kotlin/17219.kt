import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val sites = StringTokenizer(br.readLine())
    val n = sites.nextToken().toInt()
    val m = sites.nextToken().toInt()
    val map = HashMap<String, String>()

    for (i in 0 until n) {
        val info = StringTokenizer(br.readLine())

        val site = info.nextToken()
        val password = info.nextToken()

        map[site] = password
    }

    for (j in 0 until m) {
        val question = br.readLine()
        println(map[question])
    }
}