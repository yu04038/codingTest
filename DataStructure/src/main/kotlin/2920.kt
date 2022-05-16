import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))
    var bw = BufferedWriter(OutputStreamWriter(System.out))

    var code = br.readLine()

    when(code) {
        "1 2 3 4 5 6 7 8" -> println("ascending")
        "8 7 6 5 4 3 2 1" -> println("descending")
        else -> println("mixed")
    }
}