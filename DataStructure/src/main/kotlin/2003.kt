import java.util.*
import kotlin.collections.ArrayList

fun main() = with(Scanner(System. `in`)){

    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val arr = ArrayList<Int>()

    repeat(n) {
        arr.add(nextInt())
    }

    var start = 0
    var end = 0
    var sum = arr[0]
    var count = 0

    while(true) {
        if (sum == 0 || sum < m) {
            end += 1
            if (end == arr.size) {
                break
            } else {
                sum += arr[end]
            }
//            println("작을때 $start $end $sum $count")
        } else if (sum == m){
            count += 1
            sum -= arr[start]
            start += 1
//            println("같을때 $start $end $sum $count")
        } else {
            sum -= arr[start]
            start += 1
//            println("클때 $start $end $sum $count")
        }
    }
    println(count)

}