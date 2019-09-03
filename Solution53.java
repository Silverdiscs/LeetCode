/**
 * @Author: CX
 * @Date: 2019/8/29 下午 4:34
 * @Version 1.0
 * @Project: LeetCode.53  最大子序和
 */

// -1  2  3  -2

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int maxToCurr = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxToCurr = Math.max(maxToCurr + nums[i], nums[i]);
            sum = Math.max(sum, maxToCurr);
        }
        return sum;
    }
}


