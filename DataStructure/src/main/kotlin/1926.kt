import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val graphInfo = StringTokenizer(br.readLine())
    val n = graphInfo.nextToken().toInt()
    val m = graphInfo.nextToken().toInt()

    val queue = LinkedList<Pair<Int, Int>>()
    val map = HashMap<Int,Int>()
    var count = 0
    var areaNum = 0

    // 상하좌우
    val dx = listOf(-1, 1, 0, 0)
    val dy = listOf(0, 0, 1, -1)

    val graph = Array(n + 2){Array(m + 2) { 0 }}
    var visited = Array(n + 2){Array(m + 2) { false } }

    for (i in 1 .. n) {
        val line = br.readLine().split(" ").joinToString("")
        for (j in 0 until m) {
            graph[i][j + 1] = line[j] - '0'
        }
    }

    fun bfs(point: Pair<Int, Int>) {
        queue.add(point)

        visited[point.first][point.second] = true

        while (queue.isNotEmpty()) {
            count += 1

            var now = queue.poll()
            var x = now.first
            var y = now.second

            for (i in 0 until 4) {
                var nextX = x + dx[i]
                var nextY = y + dy[i]

                if (!visited[nextX][nextY] && graph[nextX][nextY] == 1) {
                    queue.add(Pair(nextX, nextY))
                    visited[nextX][nextY] = true
                }
            }
        }
    }

    for ( i in 1 .. n) {
        for (j in 1 .. m) {
            if (graph[i][j] != 0 && !visited[i][j]) {
                count = 0
                bfs(Pair(i, j))
                map[count] = map.getOrDefault(count, 0) + 1
                areaNum += 1
            }
        }
    }
    println(areaNum)
    if (map.size >= 1) {
        println(Collections.max(map.keys))
    } else {
        println(0)
    }
}