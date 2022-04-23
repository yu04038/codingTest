import java.util.*
import kotlin.collections.HashMap

fun main() = with(Scanner(System.`in`.bufferedReader())) {
    val sentence = readLine()

    val map = HashMap<String, Int>()
    var count = 0

    for (word in sentence!!.split(" ")) {
        map[word] = map.getOrDefault(word, 0) + 1
    }

    var setOfValues = map.values

    for (i in setOfValues) {
        if (i == 1) {
            count += 1
        }
    }

    if (count != setOfValues.size) println("no") else println("yes")
}
