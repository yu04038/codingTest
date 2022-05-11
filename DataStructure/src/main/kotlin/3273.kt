import java.util.*

fun main() = with(Scanner(System. `in`)){

    var total = nextInt()
    var arr = Array(total) { 0 }
    var million = Array(10000000) { 0 }
    var count = 0

    for (i in 0 until total) {
        arr[i] = nextInt()
    }

    var sum = nextInt()

    for (number in arr) {
        if (sum > number) {
            if (million[number] == 0 && million[sum - number] == 0) {
                million[sum - number] = 1
            } else {
                count += 1
            }
        }
    }
    println(count)
}