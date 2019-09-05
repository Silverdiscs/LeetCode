/**
 * @Author: CX
 * @Date: 2019/9/5 下午 4:16
 * @Version 1.0
 * @Project: LeetCode.62  不同路径
 */

public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        // initial
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        // function: dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
