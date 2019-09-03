/**
 * @Author: CX
 * @Date: 2019/8/31 上午 10:05
 * @Version 1.0
 * @Project: LeetCode.26  删除排序数组中的重复项
 */

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast-1] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
