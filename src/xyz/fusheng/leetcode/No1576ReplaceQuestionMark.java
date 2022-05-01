package xyz.fusheng.leetcode;

/**
 * @FileName: No1576ReplaceQuestionMark
 * @Author: code-fusheng
 * @Date: 2022/5/1 19:42
 * @Version: 1.0
 * @Description: No.1576 替换字符串中的问号
 */

public class No1576ReplaceQuestionMark {
    public static String modifyString(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            if (chars[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ++ch) {
                    if ((i > 0 && chars[i - 1] == ch) || (i < n - 1 && chars[i + 1] == ch)) {
                        continue;
                    }
                    chars[i] = ch;
                    break;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str1 = "?zs";
        System.out.println(modifyString(str1));
    }

}
