class Solution {
    fun solution(gems: Array<String>): IntArray {
        var answer = intArrayOf(0, 0)

        var start = 0
        var end = 0

        var count = Integer.MAX_VALUE

        var gemsSet = gems.distinct()
        println(gemsSet)

        var gemSlice = HashMap<String, Int>()

        while(true) {
            if (end == gems.size) {
                break
            } else if (gemsSet.size != gemSlice.size) {
                gemSlice[gems[end]] = gemSlice.getOrDefault(gems[end], 0) + 1
                end += 1
            } else {
                gemSlice[gems[start]] = gemSlice[gems[start]]?.minus(1) ?: 0

                if (gemSlice[gems[start]] == 0) {
                    gemSlice.remove(gems[start])
                }
                start += 1
            }
            if (gemsSet.size == gemSlice.size) {
                if (end - start < count) {
                    count = end - start
                    answer[0] = start + 1
                    answer[1] = end
                }
            }
        }
        return answer
    }
}
fun main() {
    val arr = arrayOf("DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA")

    var classSolution = Solution()

    println(classSolution.solution(arr).contentToString())
}