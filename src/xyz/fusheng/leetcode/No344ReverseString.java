package xyz.fusheng.leetcode; /**
 * @author: code-fusheng
 * @Date: 2020/9/3 22:57
 */

/**
 * @FileName: No344ReverseString
 * @Author: code-fusheng
 * @Date: 2020/9/3 22:57
 * @version: 1.0
 * Description: No.344 反转字符串
 */

public class No344ReverseString {

    public static void reverseString(char[] strArr) {
        helper(strArr, 0, strArr.length - 1);
    }

    public static void helper(char[] str, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = str[left];
        str[left++] = str[right];
        str[right--] = temp;
        helper(str, left, right);
    }

    public static void main(String[] args) {
        char[] strArr1 = {'h','e','l','l','o'};
        char[] strArr2 = {'H','a','n','n','a','h'};

        reverseString(strArr1);
        System.out.println(strArr1);

    }

}
