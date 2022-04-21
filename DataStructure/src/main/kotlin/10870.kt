import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var num = nextInt()

    println(pibonacci(num))
}

fun pibonacci(num: Int): Int {
    return if (num == 0) {
        0
    } else if (num == 1){
        1
    } else {
        return pibonacci(num - 1) + pibonacci(num - 2)
    }
}
