import java.util.*

fun main() = with(Scanner(System.`in`.bufferedReader())) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()
    var count = 0
    var sum = 0
    var totalSum = 0

    for (i in 0 .. 1000) {
        if ( i == sum) {
            list.add(count + 1)
            count += 1
            sum += count
        } else {
            list.add(count)
        }
    }

    for (num in n-1 until m) {
        totalSum += list[num]
    }
    println(totalSum)
}
