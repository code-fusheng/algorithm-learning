package xyz.fusheng.day2_时间空间复杂度;

/**
 * @author 25610
 * Desricption : 事后分析估算方法
 */
public class TimeAnalysisAfter {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
