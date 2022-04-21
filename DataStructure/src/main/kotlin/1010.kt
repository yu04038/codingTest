import java.util.*

fun main() = with(Scanner(System.`in`)) {

    var n = 0
    var m = 0
    var dp = Array(31){LongArray(31)}

    for (i in 0 until nextInt()) {
        n = nextInt()
        m = nextInt()

        for(i in 1 .. 30){
            dp[i][1]=i.toLong()
            for(j in 2 until i){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j]
            }
            dp[i][i]=1
        }
        println(dp[m][n])
    }
}