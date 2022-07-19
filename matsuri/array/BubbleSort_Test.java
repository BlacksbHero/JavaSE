package com.matsuri.array;

/**
 * Created by Matsuri on 2022/6/14 -- 14:23
 */
public class BubbleSort_Test {
    public static void main(String[] args) {
        int[] arr = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};

        //Print
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //BubbleSort
        BubbleSort(arr);

        //Print
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
