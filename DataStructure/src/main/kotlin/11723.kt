import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val number = br.readLine().toInt()
    var set = mutableSetOf<Int>()

    for (i in 0 until number) {
        var command = StringTokenizer(br.readLine())

        when (command.nextToken()) {
            "add" -> set.add(command.nextToken().toInt())

            "remove" -> {
                var num = command.nextToken().toInt()
                if (set.contains(num)) {
                    set.remove(num)
                }
            }

            "check" -> {
                var num = command.nextToken().toInt()
                bw.write(
                    if (set.contains(num)) {
                        "1\n"
                    } else {
                        "0\n"
                    }
                )
            }

            "toggle" -> {
                var num = command.nextToken().toInt()
                if (set.contains(num)) {
                    set.remove(num)
                } else {
                    set.add(num)
                }
            }

            "all" -> {
                set = mutableSetOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
            }

            "empty" -> {
                set.clear()
            }
        }
    }
    bw.flush()
    bw.close()
}