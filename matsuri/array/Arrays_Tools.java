package com.matsuri.array;

import java.util.Arrays;

/**
 * Created by Matsuri on 2022/6/14 -- 14:55
 *
 * java.util.Arrays: 操作数组的工具类, 里面定义了很多操作数组的方法.
 */
public class Arrays_Tools {
    public static void main(String[] args) {
    //1. boolean equals(int[] a, int[] b){}
        // 判断两个数组是否相等.

        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{4, 3, 2, 1};
        int[] arr3 = new int[]{1, 2, 3 ,4};
        boolean isEquals1 = Arrays.equals(arr1, arr2);
        boolean isEquals2 = Arrays.equals(arr1, arr3);
        System.out.println(isEquals1);
        System.out.println(isEquals2 + "\n");

    //2. String toString(int[] a){}
        // 输出数组信息.

        int[] arr4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        String str1 = Arrays.toString(arr4);
        System.out.println(str1 + "\n");

    //3. void fill(int[] a, int val){}
        // 将数组元素替换为指定值val.

        int[] arr5 = new int[]{1, 2, 3, 4};
        Arrays.fill(arr5, 10);
        System.out.println(Arrays.toString(arr5) + "\n");


    //4. void sort(int[] a){}
        // 将数组进行升序排序

        int[] arr6 = new int[]{2, 3, 1, 5, 2};
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6) + "\n");

    //5. int binarySearch(int[] a, int key){}
        //二分查找数组中的元素, 返回值正数为数组下标、负数为未查找到.

        int[] arr7 = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        int index1 = Arrays.binarySearch(arr7, 210);
        int index2 = Arrays.binarySearch(arr7, 0);
        System.out.println(index1 + "\n" + index2);
    }
}
