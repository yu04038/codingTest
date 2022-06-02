import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

var graphs1260 :Array<IntArray> = arrayOf()
var visited1260 = booleanArrayOf()
var vertex = 0
var edge = 0

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))

    var info = StringTokenizer(br.readLine())
    var vertex = info.nextToken().toInt()
    var edge = info.nextToken().toInt()
    var first = info.nextToken().toInt()

    graphs1260 = Array(vertex + 1){ IntArray(vertex + 1){0} }
    visited1260 = BooleanArray(vertex + 1)

    for(i in 0 until edge){
        val relations = StringTokenizer(br.readLine())
        val first = relations.nextToken().toInt()
        val second = relations.nextToken().toInt()
        graphs1260[first][second]=1
        graphs1260[second][first]=1
    }

    fun bfs1260(v : Int){
        val bw = BufferedWriter(OutputStreamWriter(System.out))

        val queue = LinkedList<Int>()

        queue.add(v)
        visited1260[v] = true

        while (queue.isNotEmpty()){
            var now = queue.poll()
            bw.write("$now ")
            for(i in graphs1260[0].indices){
                if(!visited1260[i] && graphs1260[now][i]==1){
                    queue.add(i)
                    visited1260[i] = true
                }
            }
        }
        bw.newLine()
        bw.flush()
    }

    fun dfs1260(x : Int){
        visited1260[x] = true
        print("$x ")

        for(i in 1..vertex){
            if(visited1260[i] || graphs1260[x][i] == 0) continue
            dfs1260(i)
        }
    }
    dfs1260(first)
    visited1260.fill(false)
    println("")
    bfs1260(first)
}


