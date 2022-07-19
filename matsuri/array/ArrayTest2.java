package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/04 20:05
 */

public class ArrayTest2 {
    public static void main(String[] args) {

    /*
     *   5. 数组元素的默认初始值
     *      数组元素是整型: 0
     *      数组元素是浮点型: 0.0
     *      数组元素是char型: 0 或 "\u0000", 而非‘0’
     *      数组元素是boolean型: false
     *      数组元素是引用数据类型: null
     */

        int[] arr = new int[4];
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("************");

        short[] arr1 = new short[4];
        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println("************");

        char[] arr2 = new char[4];
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("************");

        float[] arr3 = new float[4];
        for (float i : arr3) {
            System.out.println(i);
        }
        System.out.println("************");

        boolean[] arr4 = new boolean[4];
        for (boolean i : arr4) {
            System.out.println(i);
        }
        System.out.println("************");

        String[] arr5 = new String[4];
        for (String i : arr5) {
            System.out.println(i);
        }
        System.out.println("************");
    }
}
