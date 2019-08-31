/**
 * @Author: CX
 * @Date: 2019/8/30 下午 5:04
 * @Version 1.0
 * @Project: LeetCode.70  爬楼梯
 */

// 动态规划   f(n) = f(n-1) + f(n-2)
public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int current = 2;
        int prev = 1;
        for (int i = 3; i <= n; i++) {
            current = current + prev;
            prev = current - prev;
        }
        return current;
    }
}
