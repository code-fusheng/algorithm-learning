package xyz.fusheng.leetcode;

/**
 * @FileName: No908SmallestRangeI
 * @Author: code-fusheng
 * @Date: 2022/4/30 10:02
 * @Version: 1.0
 * @Description: No.908 最小差值I
 */

public class No908SmallestRangeI {

    public static int smallestRangeI(int[] nums, int k) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return Math.max(0, max - min - k * 2);
    }

    public static void main(String[] args) {
        int[] case1 = {1};
        int i = smallestRangeI(case1, 0);
        System.out.println(i);
    }

}
