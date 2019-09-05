/**
 * @Author: CX
 * @Date: 2019/9/4 上午 10:42
 * @Version 1.0
 * @Project: LeetCode.11  盛最多水的容器
 */

public class Solution11 {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            // 比较现有的面积和之前的面积, 取最大值
            // 面积的计算是用横向的值 乘以 纵向上较小的值
            // 盛水的多少当然取决于纵向上的最小值纵向上
            area = Math.max(area, (right-left) *
                    Math.min(height[left], height[right]));
            if (height[left] > height[right]) right--;
            else if (height[left] < height[right]) left++;
            else {
                // 当左值与右值相同时, 需要左右指针同时移动
                // 如只移动其中一个指针, 后面的面积只会比之前的面积小
                // 因为横向的值在减小，而纵向的值只取决于较小的数值
                left++;
                right--;
            }
        }
        return area;
    }
}
