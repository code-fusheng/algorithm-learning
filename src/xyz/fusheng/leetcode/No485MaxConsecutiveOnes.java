package xyz.fusheng.leetcode; /**
 * @author: code-fusheng
 * @Date: 2020/9/5 13:55
 */

/**
 * @FileName: No485MaxConsecutiveOnes
 * @Author: code-fusheng
 * @Date: 2020/9/5 13:55
 * @version: 1.0
 * Description: No.485 最大连续1的个数
 */

public class No485MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int conCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                conCount++;
                if (conCount > maxCount) {
                    maxCount = conCount;
                }
            } else {
                conCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums1));
    }

}
