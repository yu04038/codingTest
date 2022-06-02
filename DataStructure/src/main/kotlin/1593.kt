import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val wantToFind = StringTokenizer(br.readLine())
    val fragmentLength = wantToFind.nextToken().toInt()
    val wordLength = wantToFind.nextToken().toInt()
    var count = 0

    val fragment = br.readLine().toList()
    val arr = Array(52) { 0 }
    val word = br.readLine().toList()

    for ( i in fragment) {
        if (i.toInt() > 90) arr[i.toInt() - 71] += 1
        else arr[i.toInt() - 65] += 1
    }

    word.windowed(size = fragmentLength, step = 1).forEach{

        var array = Array(52) { 0 }

        for (j in it) {
            if (j.toInt() > 90) array[j.toInt() - 71] += 1
            else array[j.toInt() - 65] += 1
        }
        if (arr.contentEquals(array)) {
            count += 1
        }
    }
    println(count)
}