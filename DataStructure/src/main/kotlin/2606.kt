import java.util.*

var graphs :Array<IntArray> = arrayOf()
var visited : BooleanArray = booleanArrayOf()
var answer = 0
fun main(){

    var computer = readLine()!!.toInt()
    var vertex = readLine()!!.toInt()

    graphs = Array(computer+1){ IntArray(computer+1){0} }
    visited = BooleanArray(computer+1)

    for(i in 0 until vertex){
        var str = readLine()!!.split(" ").map { it.toInt() }
        graphs[str[0]][str[1]]=1
        graphs[str[1]][str[0]]=1
    }


    bfs(1)
    println(answer)

}
fun bfs(v : Int){
    var queue = LinkedList<Int>()

    queue.add(v)
    visited[v] = true
    while (queue.isNotEmpty()){
        var now = queue.poll()
        println(queue)
        for(i in graphs[0].indices){
            if(!visited[i] && graphs[now][i]==1){
                queue.add(i)
                visited[i] = true
                answer++
            }
        }
    }
}