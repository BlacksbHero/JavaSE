package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/06 22:14
 */

public class ArrayWork3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
