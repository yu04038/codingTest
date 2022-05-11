import java.util.*

fun main() = with(Scanner(System. `in`)){

    var total = nextInt()
    var arr = Array(total) { 0 }
    var count = 0

    for (i in 0 until total) {
        arr[i] = nextInt()
    }

    var search = nextInt()

    for (number in arr) {
        if (search == number) {
            count += 1
        }
    }
    println(count)

}