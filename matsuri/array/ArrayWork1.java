package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/05 1:29
 */

public class ArrayWork1 {
    public static void main(String[] args) {
        int[] str = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        StringBuilder tel = new StringBuilder();
        for (int j : index) {
            tel.append(str[j]);
        }
        System.out.println("Number: " + tel);
    }
}
