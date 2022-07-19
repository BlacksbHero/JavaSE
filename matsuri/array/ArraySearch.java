package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/07 7:16
 */

public class ArraySearch {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i : array1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        array2 = array1;
        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0){
                array2[i] = i;
            }
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

    //查找( 搜索 )
        //线性查找
        String[] arraySearch1 = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};
        String dest = "DD";
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < arraySearch1.length; i++) {
            if (dest.equals(arraySearch1[i])){
                flag = true;
                index = i;
            }
        }
        System.out.println("是否有该元素: " + flag + " 下标为: " + index);

        //二分查找: 必须有序
        System.out.println("BinarySearch:");
        int[] arraySearch2 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        int target = 210;
        int head = 0;
        int rear = arraySearch2.length - 1;
        while (head <= rear){
            int mid = (head + rear) / 2;
            if (target == arraySearch2[mid]){
                System.out.println("Find it and it's index is: " + mid);
                break;
            } else if (target < arraySearch2[mid]) {
                rear = mid - 1;
            }else {
                head = mid + 1;
            }
        }
    }
}
