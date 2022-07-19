package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/06 22:30
 */

public class YanghuiTriangle {
    public static void main(String[] args) {
        //二维数组定义
        int[][] yangHui = new int[10][];

        //元素赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //首位元素
            yangHui[i][0] = 1;
            //末尾元素
            yangHui[i][i] = 1;

            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        //遍历数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
