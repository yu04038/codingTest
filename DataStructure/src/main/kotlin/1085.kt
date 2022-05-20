import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main()  {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val four = StringTokenizer(br.readLine())
    val arr = mutableListOf<Int>()
    val x = four.nextToken().toInt()
    val y = four.nextToken().toInt()
    val w = four.nextToken().toInt()
    val h = four.nextToken().toInt()

    val rightX = w - x
    val bottomY = h - y

    arr.add(x)
    arr.add(y)
    arr.add(rightX)
    arr.add(bottomY)

    println(arr.minOrNull())
}
