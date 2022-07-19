package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/06 21:47
 */

public class ArrayTest3 {
    public static void main(String[] args) {

        int[][] array1 = new int[4][3];
        System.out.println(array1[0]); //输出地址
        System.out.println(array1[0][0]); //0

        float[][] array2 = new float[4][3];
        System.out.println(array2[0]); //输出地址
        System.out.println(array2[0][0]); //0.0

        String[][] array3 = new String[4][3];
        System.out.println(array3[0]); //输出地址
        System.out.println(array3[0][0]); //null
    }
}
