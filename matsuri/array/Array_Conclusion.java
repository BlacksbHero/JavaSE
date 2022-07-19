package com.matsuri.array;

import java.util.Arrays;

/**
 * Created by Matsuri on 2022/6/14 -- 15:43
 */
public class Array_Conclusion {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        System.out.println("原始数组:");
        System.out.println(Arrays.toString(arr1) + "\n");

        //BubbleSort
        System.out.println("冒泡排序:");
        BubbleSort(arr1);

        //Reverse
        int[] arr2 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        System.out.println("数组反转:");
        Reverse(arr2);

        //Copy
        System.out.println("数组复制:");
        int[] arr3 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        Copy(arr3);

        //Search a val
        System.out.println("二分查找:");
        int[] arr4 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        int index = Search(arr4, 22);
        System.out.println(index);
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
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void Reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void Copy(int[] arr){
        int[] arr_copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr_copy) + "\n");
    }

    public static int Search(int[] arr, int val){
        int index = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == val){
                index = i;
            }
        }
        return index;
    }
}
