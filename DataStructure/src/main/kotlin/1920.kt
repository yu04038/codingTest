import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numberN = StringTokenizer(br.readLine()).nextToken().toInt()
    val arrN = StringTokenizer(br.readLine())
    val arr = mutableSetOf<String>()
    for (i in 0 until numberN) {
        arr.add(arrN.nextToken())
    }

    val numberM = StringTokenizer(br.readLine()).nextToken().toInt()
    val arrM = StringTokenizer(br.readLine())
    for (j in 0 until numberM) {
        if (arr.contains(arrM.nextToken())) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }
    bw.flush()
    bw.close()
}