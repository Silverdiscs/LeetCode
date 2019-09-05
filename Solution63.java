/**
 * @Author: CX
 * @Date: 2019/9/5 下午 4:47
 * @Version 1.0
 * @Project: LeetCode.63  不同路径 II
 */

public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        // initial: if seeing 1, then init value is 0 after it
        for (int i = 0; i < m; i++) {
            // 如果当前位置是是墙, break
            if (obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            // 如果当前位置是是墙, break
            if (obstacleGrid[0][j] == 1) break;
            dp[0][j] = 1;
        }
        // function: dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 如果当前计算的位置是是墙，跳过 ————
                // 当前位置的default值，也就是0 不作变化
                if (obstacleGrid[i][j] == 1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
