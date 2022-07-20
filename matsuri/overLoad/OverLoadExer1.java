package com.matsuri.overLoad;

/**
 * Created by Matsuri on 2022/7/19 - 16:41
 *
 * 1. 编写程序, 定义三个重载方法并调用. 方法名为 mOL.
 *   三个方法分别接受一个int参数、 两个int参数、 一个字符串参数.
 *   分别执行平方运算并输出结果, 相乘并输出结果, 输出字符串信息.
 *   在主类 main() 方法中分别用参数区别调用三个方法.
 *
 */

public class OverLoadExer1 {
    //平方匀运算
    public void mOL(int i){
        System.out.println(i * i);
    }
    //相乘
    public void mOL(int i, int j){
        System.out.println(i * j);
    }
    //输出字符串
    public void mOL(String s){
        System.out.println(s);
    }
}
