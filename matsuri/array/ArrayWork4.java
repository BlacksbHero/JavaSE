package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/07 6:42
 */

public class ArrayWork4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0, max = 0x80000000, min = 0x7fffffff;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            sum += arr[i];
            System.out.print(arr[i] + " ");
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum:" + sum + " Ave: " + (float)sum / arr.length);
        System.out.println("Max: " + max + " Min: " + min);
    }
}
