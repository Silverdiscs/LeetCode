/**
 * @Author: CX
 * @Date: 2019/8/9 下午 4:26
 * @Version 1.0
 * @Project: LeetCode.35  搜索插入位置
 */

public class SearchInsertPosition {
    public int searchInsert(int[] nums,int target) {
        if (nums == null || nums.length == 0)
            return 0;
        int start = 0;
        int end = nums.length - 1;
        // 二分法查找，看 target是否在于 nums中
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid;
            else if (nums[mid] > target)
                end = mid;
            else
                return mid;
        }
        // target不在 nums中
        // target大于右边的指针
        if (nums[end] < target)
            // 在右边指针的 index+1处插入target
            return end + 1;
        // target小于或等于左边的指针
        else if (nums[start] >= target)
            // 将target插到左指针 index处
            return start;
        // target在左右指针中间
        else
            // 需要在左右指针中间插入
            // 返回右指针的 index
            return end;
    }
}
