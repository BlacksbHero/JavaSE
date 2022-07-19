package com.matsuri.ArrayUtilTool;

/**
 * Created by Matsuri on 2022/6/29 -- 18:12
 */

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{1, 3, 2, 5, 6, 8, 7, 4, 9, 0};

        System.out.println("原数组: ");
        util.printArr(arr);

        System.out.println("查找元素下标(-1为未查询到): "
                + util.searchArr(arr, 7));

        System.out.println("数组最大值: " + util.getMax(arr));

        System.out.println("数组最小值: " + util.getMin(arr));

        System.out.println("数组平均值: " + util.getAve(arr));

        System.out.println("反转数组: ");
        util.revArr(arr);
        util.printArr(arr);

        System.out.println("复制数组: ");
        util.printArr(util.copyArr(arr));

        System.out.println("数组排序: ");
        util.sortArr(arr);
        util.printArr(arr);

    }
}
