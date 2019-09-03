import java.util.regex.Matcher;

/**
 * @Author: CX
 * @Date: 2019/8/26 下午 3:34
 * @Version 1.0
 * @Project: LeetCode.3  无重复字符的最长子串
 */

public class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int left = 0, right = 0;
        int n = s.length();
        boolean[] used = new boolean[128];
        int max = 0;
        while (right < n) {
            if (used[s.charAt(right)] == false) {
                used[s.charAt(right)] = true;
                right++;
            }else {
                max = Math.max(max, right-left);
                while (left < right && s.charAt(right) != s.charAt(left)) {
                    used[s.charAt(left)] = false;
                    left++;
                }
                left++;
                right++;
            }
        }
        max = Math.max(max, right-left);
        return max;
    }
}
