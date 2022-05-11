import java.util.*

fun main() = with(Scanner(System. `in`)){

    var word = readLine().toString()
    var arr = Array(26) { 0 }

    for (alphabet in word) {
        arr[alphabet.toInt() - 97] += 1
    }
    println(arr.joinToString(" "))

}