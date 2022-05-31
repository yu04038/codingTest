import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    var br = BufferedReader(InputStreamReader(System.`in`))

    var ranNeeded = StringTokenizer(br.readLine())
    var n = ranNeeded.nextToken().toULong()
    var m = ranNeeded.nextToken().toULong()
    var arr = mutableListOf<ULong>()

    for (i in 0UL until n) {
        var ran = br.readLine().toULong()
        arr.add(ran)
    }
    arr.add(0UL)
    arr.sort()

    println(binarySearch1654(arr, m))
}

fun binarySearch1654(arr: MutableList<ULong>, target: ULong): ULong? {
    var low = 1UL
    var high = arr.last()
    var num = arr.last()
    val list = mutableListOf<ULong>()

    if (calculateRanNum(arr, arr.last()) == target) {
        list.add(arr.last())
    }

    while (low <= high) {
        val mid = (low + high) / 2UL
        if (mid == 0UL) {
            break
        }

        when {
            calculateRanNum(arr, mid) >= target -> {
                if (!list.contains(mid)) {
                    list.add(mid)
                } else {
                    break
                }
                low = mid + 1UL
            }

            else -> high = mid - 1UL
        }
    }
    return list.maxOrNull()
}

fun calculateRanNum(arr: MutableList<ULong>, mid: ULong): ULong {
    var count = 0UL

    for (i in arr) {
        count += i / mid
    }
    return count
}