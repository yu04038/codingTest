import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

var graphs :Array<IntArray> = arrayOf()
var visited = booleanArrayOf()
var answer = 0
fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))

    var computer = br.readLine().toInt()
    var vertex = br.readLine().toInt()

    graphs = Array(computer + 1){ IntArray(computer + 1){0} }
    visited = BooleanArray(computer+1)

    for(i in 0 until vertex){
        val relation = StringTokenizer(br.readLine())
        val first = relation.nextToken().toInt()
        val second = relation.nextToken().toInt()
        graphs[first][second]=1
        graphs[second][first]=1
    }

    bfs(1)
    println(answer)
}
fun bfs(v:Int){
    val queue = LinkedList<Int>()

    queue.add(v)
    visited[v] = true

    while (queue.isNotEmpty()){
        println(queue)
        var now = queue.poll()
        for(i in graphs[0].indices){
            if(!visited[i] && graphs[now][i]==1){
                queue.add(i)
                visited[i] = true
                answer++
            }
        }
    }
}