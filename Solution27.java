/**
 * @Author: CX
 * @Date: 2019/8/9 下午 3:46
 * @Version 1.0
 * @Project: LeetCode.27  移除元素
 */

public class Solution27 {
    public int removeElement(int[] nums,int val) {
        if (nums == null)
            return 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果当前遍历时指向的值不是要移除的值 val
            // 就把它的值赋给 slow代表的在原数组的位置，slow + 1
            // 然后 slow作为指标继续向前走（更新）
            if (nums[i] != val) {
                nums[slow++] = nums[i];
            }
        }
        // 返回 slow，代表更新后数组的长度
        return slow;
    }
}
