import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val graphInfo = StringTokenizer(br.readLine())
    val n = graphInfo.nextToken().toInt()
    val m = graphInfo.nextToken().toInt()
    val queue = LinkedList<Pair<Int, Int>>()
    var answer = 0

    // 상하좌우
    val dx = listOf(-1, 1, 0, 0)
    val dy = listOf(0, 0, 1, -1)

    // 가장자리 띄어줌
    var graph = Array(n+2) { Array(m+2) {0}}
    var visited2178 = Array(n+2) { Array(m+2) {false}}

    for(i in 1 .. n){
        val line = br.readLine()
        for(j in 0 until m){
            graph[i][j+1] = line[j] - '0'
        }
    }

    fun bfs2178(point: Pair<Int, Int>) {
        queue.add(point)

        visited2178[point.first][point.second] = true

        while (queue.isNotEmpty()) {
            answer += 1

            var now = queue.poll()
            val x = now.first
            val y = now.second

            for (i in 0 until 4) {
                val nextX = x + dx[i]
                val nextY = y + dy[i]

                if (!visited2178[nextX][nextY] && graph[nextX][nextY] == 1) {
                    queue.add(Pair(nextX, nextY))
                    graph[nextX][nextY] = graph[x][y] + 1
                    visited2178[nextX][nextY] = true
                }
            }
        }
    }

    bfs2178(Pair(1, 1))
    println(graph[n][m])
}