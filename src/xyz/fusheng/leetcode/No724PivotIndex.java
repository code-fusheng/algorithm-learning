package xyz.fusheng.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: No724_pivotIndex
 * @Author: code-fusheng
 * @Date: 2020/7/26 10:04
 * @version: 1.0
 * Description: 寻找数组的中心索引
 */

public class No724PivotIndex {

    public static int pivotIndex(int[] nums) {
        // 整个数组的和
        int sum = 0;
        // 索引左边的和
        int leftsum = 0;
        // 数组求和
        for (int x : nums) {
            sum += x;
        }
        // 从左边开始遍历数组
        for (int i = 0; i < nums.length; ++i) {
            // 如果左边的和 == 数组的和 - 左边的和 - 当前数组元素
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int result = pivotIndex(nums);
        System.out.println(result);
    }

}
