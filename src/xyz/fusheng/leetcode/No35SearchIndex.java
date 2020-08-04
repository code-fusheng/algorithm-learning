package xyz.fusheng.leetcode;

/**
 * @FileName: No35SearchIndex
 * @Author: code-fusheng
 * @Date: 2020/8/2 20:56
 * @version: 1.0
 * Description: 搜索插入位置
 */

public class No35SearchIndex {

    /**
     * 传统遍历数组
     * @param nums
     * @param target
     * @return
     */
    public static int SearchIndex(int[] nums, int target) {
        int searchIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                searchIndex = i;
                break;
            } else if (nums[i] > target) {
                searchIndex = i;
                break;
            } else if (i == nums.length - 1 && nums[i] < target) {
                searchIndex = i + 1;
                break;
            }
        }
        return searchIndex;
    }

    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public static int SearchIndexPro(int[] nums, int target) {
        int searchIndex = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target <= nums[mid]) {
                searchIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return searchIndex;
    }

    public static void main(String[] args) {

        // int[] nums = {1, 3, 5, 6};
        // int target = 4;

        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int result = SearchIndexPro(nums, target);
        System.out.println(result);

    }
}
