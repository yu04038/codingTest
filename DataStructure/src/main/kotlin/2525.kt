import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var hour = nextInt()
    val minute = nextInt()
    val elapsed = nextInt()
    var result = 0

    if (minute + elapsed > 59) {
        result = (minute + elapsed) % 60
        hour += (minute + elapsed) / 60
    } else {
        result = minute + elapsed
    }

    if (hour > 23) {
        hour -= 24
    }

    println("$hour $result")

}