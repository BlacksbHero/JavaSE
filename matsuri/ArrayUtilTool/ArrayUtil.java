package com.matsuri.ArrayUtilTool;

import java.lang.Integer;
/**
 * Created by Matsuri on 2022/6/27 -- 17:43
 */

public class ArrayUtil {

    //求数组的最大值
    public int getMax(int[] arr){
        int temp = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > temp) {
                temp = i;
            }
        }
        return temp;
    }

    //求数组的最小值
    public int getMin(int[] arr){
        int temp = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < temp) {
                temp = i;
            }
        }
        return temp;
    }

    //求数组的和
    public int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //求数组的平均值
    public double getAve(int[] arr){
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    //反转数组
    public void revArr(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //复制数组
    public int[] copyArr(int[] arr){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    //数组排序
    public void sortArr(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //遍历数组
    public void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //查找数组的值
    public int searchArr(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
