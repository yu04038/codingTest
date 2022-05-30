import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val tree = StringTokenizer(br.readLine())
    val treeNum = tree.nextToken().toLong()
    val meter = tree.nextToken().toLong()

    val arr = mutableListOf<Long>()
    val treeMeter = StringTokenizer(br.readLine())

    for (i in 0 until treeNum) {
        arr.add(treeMeter.nextToken().toLong())
    }
    arr.add(0L)

    arr.sort()

    println(binarySearch(arr, meter))
}

fun binarySearch(arr: MutableList<Long>, target: Long): Long {
    var low = arr[0]
    var high = arr.last()
    var mid = 0L
    var list = mutableListOf<Long>()
    var num = 0L

    while (low <= high) {
        mid = (low + high) / 2
        when {
            calculateMeter(arr, mid) == target -> {
                if (num < mid) {
                    num = mid
                }
                break
            }
            calculateMeter(arr, mid) > target -> {
                if (num < mid) {
                    num = mid
                }
                low = mid + 1
            }
            else -> high = mid - 1
        }
    }
    return num
}

fun calculateMeter(arr: MutableList<Long>, mid: Long): Long {

    var meter = 0L
    for (i in arr) {
        if (i > mid) {
            meter += (i - mid)
        }
    }
    return meter
}