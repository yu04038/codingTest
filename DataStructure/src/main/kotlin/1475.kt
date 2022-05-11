import java.util.*

fun main() = with(Scanner(System. `in`)){

    var roomNumber = nextInt().toString()
    var arr = Array(10) {0}


    for (num in roomNumber) {
        if (num == '9' || num == '6') {
            if (arr[9] > arr[6]) {
                arr[6] += 1
            } else {
                arr[9] += 1
            }
        } else {
            arr[num.toInt() - 48] += 1
        }
    }
    println(arr.maxOrNull())
}