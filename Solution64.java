/**
 * @Author: CX
 * @Date: 2019/9/5 下午 5:36
 * @Version 1.0
 * @Project: LeetCode.64  最小路径和
 */

public class Solution64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // state:  dp[i][j]: min Sum from (0,0) to (i,j)
        int[][] dp = new int[m][n];
        // init
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        // function: dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
