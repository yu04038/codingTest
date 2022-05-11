import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()!!.trim().toInt()
    val (start, end) = readLine()!!.split(" ").map { it.toInt() }
    val m = readLine()!!.trim().toInt()
    val graph = Array<MutableList<Int>>(n+1) {mutableListOf()}

    val visited = BooleanArray(n+1)
    var answer = 0

    for (i in 0 until m) {
        var (s, e) = readLine()!!.split(" ").map {it.toInt()}
        graph[s].add(e)
        graph[e].add(s)
    }

    for (i in graph.indices) {
        println(graph[i])
    }

    fun dfs(start: Int, num: Int) {
        if (start == end) {
            answer = num
            return
        }

        for (i in graph[start]) {
            if (!visited[i]) {
                visited[i] = true
                dfs(i, num + 1)
            }
        }
    }

    dfs(start, 0)

    println(visited.contentToString())


    when (answer) {
        0 -> println(-1)
        else -> println(answer)
    }
}