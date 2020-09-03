package xyz.fusheng.leetcode;

/**
 * @FileName: No9IsPalindrome
 * @Author: code-fusheng
 * @Date: 2020/9/1 11:34
 * @version: 1.0
 * Description: No.9 回文数
 */

public class No9IsPalindrome {

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;
        System.out.println(isPalindrome(test3));
    }

}
