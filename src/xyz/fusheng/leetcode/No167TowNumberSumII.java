package xyz.fusheng.leetcode; /**
 * @author: code-fusheng
 * @Date: 2020/9/5 12:03
 */

import java.util.Arrays;

/**
 * @FileName: No167TowNumberSumII
 * @Author: code-fusheng
 * @Date: 2020/9/5 12:03
 * @version: 1.0
 * Description: No.167 两数之和
 * 解法说明: 双指针法
 * 1、初始状态下，令 left 指向数组第一个元素， right 指向最后一个元素
 * 2、进入循环，控制循环结束条件为 left >= right
 * 3、在每一次循环中，判断 target 与 当前 left、right 位置的和的关系，这里有三种情况
 * 3.1 当 target == numbers[left] + numbers[right] ，返回当前的 left 和 right
 * 3.2 当 target < numbers[left] + numbers[right] ， 因为是有序数组，所以考虑将大的值减小，也就是靠右边的值 right--
 * 3.3 当 target > numbers[left] + numbers[right] ， 因为是有序数组，所以考虑将小的值增大，也就是靠左边的值 left++
 */

public class No167TowNumberSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        int right = numbers.length - 1;
        int left = 0;
        while (left < right) {
            if (target == numbers[left] + numbers[right]) {
                result = new int[]{left + 1, right + 1};
                return result;
            } else if (target < numbers[left] + numbers[right]) {
                right --;
            } else if (target > numbers[left] + numbers[right]) {
                left ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

}
