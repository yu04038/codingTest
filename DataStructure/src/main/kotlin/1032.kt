import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))

    var number = StringTokenizer(br.readLine()).nextToken().toInt()

    var arr = mutableListOf<String>()
    var string = ""

    for (i in 0 until number) {
        arr.add(StringTokenizer(br.readLine()).nextToken())
    }

    for (num in 0 until arr[0].length) {
        var arr2 = mutableListOf<String>()

        for (k in arr.indices) {
            if (!arr2.contains(arr[k][num].toString())) {
                arr2.add(arr[k][num].toString())
            }
        }
        string += if (arr2.size == 1) {
            arr2[0]
        } else {
            "?"
        }
    }
    println(string)
}