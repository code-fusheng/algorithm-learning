package xyz.fusheng.哔哩笔试; /**
 * @author: code-fusheng
 * @Date: 2020/9/4 20:20
 */

/**
 * @FileName: StringTest
 * @Author: code-fusheng
 * @Date: 2020/9/4 20:20
 * @version: 1.0
 * Description:
 */

public class StringTest {

    public static int getCountAvg(String str) {
        int result = 0;
        int sumCount = 0;
        int charCount = 0;
        int typeCount = 0;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i ++ ) {
            if ( i != 0 ) {
                if (chars[i] == chars[i -1]) {
                    charCount ++;
                } else {
                    sumCount = sumCount + charCount;
                    charCount = 0;
                    charCount ++;
                    typeCount++;
                }
            } else {
                charCount ++;
                typeCount ++;
            }
        }
        result = sumCount / typeCount;
        return result;
    }

    public static void main(String[] args) {
        String str1 = "aaabbaaac";
        System.out.println(getCountAvg(str1));
    }

}
