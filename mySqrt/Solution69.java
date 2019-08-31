/**
 * @Author: CX
 * @Date: 2019/8/29 下午 5:38
 * @Version 1.0
 * @Project: LeetCode.69  x 的平方根
 */

public class Solution69 {
    // 解法一: 二分查找思想
    public int mySqrt(int n) {
        if (n <= 0)
            return 0;
        int magicNum = (int)Math.sqrt(Integer.MAX_VALUE);
        int start = 1, end = magicNum;
        while (start+1 < end) {
            int mid = start + (end-start) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid > n)
                end = mid;
            else start = mid;
        }
        if (end * end <= n)
            return end;
        else return start;
    }

    // 解法二
    public int mySqrt2(int n) {
        if (n <= 0)
            return 0;
        int curr = 0;
        int res = 0;
        int add = 1;
        while (curr <= n) {
            if (Integer.MAX_VALUE -curr < add)
                return res;
            curr += add;
            res++;
            add += 2;
        }
        return res-1;
    }
}
