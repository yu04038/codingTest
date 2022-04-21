import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var num = nextInt()

    println(factorial(num))
}

fun factorial(num: Int): Int {0
    return if (num == 0) {
        1
    } else {
        num * factorial(num - 1)
    }
}
