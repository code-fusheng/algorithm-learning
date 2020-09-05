package xyz.fusheng.leetcode; /**
 * @author: code-fusheng
 * @Date: 2020/9/5 13:03
 */

import java.util.Arrays;

/**
 * @FileName: No27RemoveElement
 * @Author: code-fusheng
 * @Date: 2020/9/5 13:03
 * @version: 1.0
 * Description: No.27 移除元素 -
 * 解法说明 : 双指针 - 快慢指针
 * 1、初始状态下，令 fast 和 slow 都指向数组第一个元素，也就是 nums[0]
 * 2、进入循环，控制循环结束条件为 fast >= nums.length
 * 3、在每一次循环中，判断 nums[fast] 是否与 指定的 val 值相等
 * 3.1 相等的话。fast ++ ，slow 原地不动 [fast ++ ，是为了继续去遍历后面的值，而slow不动是因为当前值等于 val 需要被删除
 * 这里删除的办法就是将 fast 在后面找到的不等于 val 的值，赋给 slow , 也就是 3.2 操作 ]
 * 3.2 不等的情况下，将 nums[fast] 赋给 nums[slow] 之后， fast ++ 和 slow ++ 继续向后寻找
 */

public class No27RemoveElement {

    public static int removeElement(int[] nums, int val) {
        // 快指针
        int fast = 0;
        // 慢指针
        int slow = 0;
        while ( fast < nums.length ) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                fast ++;
                slow ++;
            } else {
                fast ++;
            }
        }
        // 用于测试结果
        System.out.println(Arrays.toString(Arrays.copyOf(nums, slow)));
        return slow;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
    }

}
