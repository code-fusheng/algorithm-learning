package xyz.fusheng.京东笔试;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @FileName: BollGame
 * @Author: code-fusheng
 * @Date: 2020/8/27 20:20
 * @version: 1.0
 * Description: 滚球游戏
 */

public class BollGame {

    public static int bollGame(int[][] arr) {
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[][] arr = new int[k][];
        for (int i = 0; i < k; i ++) {
            Scanner sc = new Scanner(System.in);
            String layout = sc.nextLine();
            List<String> newStr = Arrays.asList(layout.split("\\s+"));
            for (int j = 0; j < newStr.size(); j ++) {
                arr[i][j] = Integer.parseInt(newStr.get(j));
            }
            System.out.println(layout);
        }
    }

}
