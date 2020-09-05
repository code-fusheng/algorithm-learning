package xyz.fusheng.leetcode; /**
 * @author: code-fusheng
 * @Date: 2020/9/5 14:22
 */

import java.util.Arrays;

/**
 * @FileName: No209MinSubArrayLen
 * @Author: code-fusheng
 * @Date: 2020/9/5 14:22
 * @version: 1.0
 * Description: No.209 长度最小的子数组
 */

public class No209MinSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums) {
        // 快指针
        int fast = 0;
        // 慢指针
        int slow = 0;
        // 数组长度
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // 最小子串长度 假定最小的子串长度为数组长度
        int minSubLen = n;
        // 子串和
        int sum = 0;
        while (fast < n) {
            sum = sum + nums[fast];
            while (sum >= s) {
                minSubLen = Math.min(minSubLen, fast - slow + 1);
                sum = sum - nums[slow];
                slow ++;
            }
            fast ++;
        }
        return minSubLen;
    }

    public static void main(String[] args) {
        int s1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(s1, nums1));
    }

}
