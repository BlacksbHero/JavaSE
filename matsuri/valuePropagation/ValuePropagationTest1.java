package com.matsuri.valuePropagation;

/**
 * Created by Matsuri on 2022/7/22 - 22:11
 *
 *  方法形参的传递机制: 值传递
 *      1. 形参: 方法定义时小括号内的参数.
 *      2. 实参: 调用时传入的值就是实参.
 *
 *      值传递机制:
 *          如果参数是基本数据类型, 此时实参赋给形参的是实参真是存储的数据值.
 *
 *
 */

public class ValuePropagationTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println(m + ", " + n);
        //交换两个变量的值
//        int temp = m;
//        m = n;
//        n = temp;
        ValuePropagationTest1 test1 = new ValuePropagationTest1();
        test1.swap(m, n);
        System.out.println(m + ", " + n);
    }

    public void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;
        System.out.println(m + ", " + n);
    }
}
