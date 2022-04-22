import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System.`in`.bufferedReader())) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    var min =
        when (n > m) {
            true -> m
            else -> n
        }

    var square = 1

    val enabled = ArrayList<Int>()

    val arr = Array(n) { readLine()!!.toCharArray() }

    while(square < min) {
        for (row in 0 until n) {
            for (column in 0 until m) {
                if (column + square >= m || row + square >= n) {
                } else {
                    if (arr[row][column] == arr[row][column + square] && arr[row][column] == arr[row + square][column]
                        && arr[row][column] == arr[row + square][column + square]) {
                        enabled.add((square + 1) * (square + 1))
                    }
                }
            }
        }
        square += 1
    }

    if (enabled.size == 0) {
        print(1)
    } else {
        print(enabled.maxOrNull())
    }
}
