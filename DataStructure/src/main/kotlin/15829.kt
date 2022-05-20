import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val stringLength = StringTokenizer(br.readLine()).nextToken().toInt()
    val string = StringTokenizer(br.readLine()).nextToken()

    var expo = 1L
    var sum = 0L
    for((count, w) in string.indices.withIndex()) {
        expo = if(count==0)
            1L
        else
            (expo*31)%1234567891

        sum=(sum+(string[w].toInt()-96) * expo) % 1234567891
    }

    println(sum % 1234567891L)
}
