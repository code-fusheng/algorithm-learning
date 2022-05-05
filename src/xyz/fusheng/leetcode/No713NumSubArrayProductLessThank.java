package xyz.fusheng.leetcode;

/**
 * @FileName: No713NumSubArrayProductLessThank
 * @Author: code-fusheng
 * @Date: 2022/5/5 06:40
 * @Version: 1.0
 * @Description: No.713 乘积小于K的子数组
 */

public class No713NumSubArrayProductLessThank {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ret = 0;
        int prod = 1;
        int i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;
         }
        return ret;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(test1, 100));
    }

}
