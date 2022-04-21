import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var first = nextInt()
    val second = nextInt()
    val third = nextInt()
    var price = 0

    var arr = arrayListOf(first, second, third)

    price = if (first == second && second == third) {
        first * 1000 + 10000
    } else if (first == second && second != third){
        first * 100 + 1000
    } else if (second == third && third != first){
        second * 100 + 1000
    } else if (third == first && first != second) {
        first * 100 + 1000
    } else {
        arr.maxOrNull()!! * 100
    }
    println(price)
}