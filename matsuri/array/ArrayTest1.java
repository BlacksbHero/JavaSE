package com.matsuri.array;

/**
 * Create by Matsuri on 2022/06/01 20:08
 */

public class ArrayTest1 {
    public static void main(String[] args) {

    //1. 一维数组的声明和初始化
        //1.1 静态初始化: 数组的初始化和数组元素的赋值同时进行.
        int[] ids;  //声明
        ids = new int[]{1001, 1002, 1003};

        //1.2 动态初始化: 数组的初始化和数组元素的赋值分开进行.
        String[] names = new String[3];

        //总结: 数组一旦初始化完成，其长度就确定了.

    //2. 如何调用数组的指定位置的元素: 通过下标的方式调用.
        names[0] = "曾";
        names[1] = "汪";
        names[2] = "唐";

    //3. 如何获取数组长度
        //属性: length
        System.out.println(ids.length);
        System.out.println(names.length);

    //4. 如何遍历数组
        for (int i : ids){
            System.out.println(i);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
