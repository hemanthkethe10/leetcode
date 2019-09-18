import kotlin.math.min

fun main() {
println(minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))
}

fun minCostClimbingStairs(cost: IntArray): Int {
    val len = cost.size
    val dp = IntArray(len)
    dp[0] = cost[0]
    dp[1] = cost[1]
    (2 until len).map { dp[it] = cost[it] + min( dp[it - 1],dp[it - 2]) }
    return min(dp[len - 1], dp[len - 2])
}