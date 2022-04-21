import java.util.*

fun main() = with(Scanner(System.`in`)) {

    var num = nextInt()

    var arr = MutableList(num) { index -> 0 }
    for (i in 0 until num) {
        var divisor = nextInt()
        arr[i] = divisor
    }

    if (arr.size == 1) {
        println(arr[0] * arr[0])
    } else if (arr.size == 2) {
        if (lcm(arr[0].toLong(), arr[1].toLong()) == arr.sorted()[1].toLong()) {
            println(arr[0] * arr[1])
        } else {
            println(lcm(arr[0].toLong(), arr[1].toLong()))
        }
    } else {
        var init = 1L
        for (number in arr) {
            init = lcm(init, number.toLong())
        }
        when (arr.none { it.toLong() == init }) {
            true -> println(init)
            false -> println(init * arr.sorted()[0])
        }
    }
}

fun lcm( a:Long, b:Long):Long {
    return (a * b) / gcd(a, b)
}

fun gcd(a: Long, b: Long): Long = if(b != 0L) gcd(b, a % b) else a