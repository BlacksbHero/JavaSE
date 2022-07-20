package com.matsuri.overLoad;

/**
 * Created by Matsuri on 2022/7/20 - 13:20
 *
 * 2. 定义三个重载方法 max(),
 *  *   第一个方法求两个 int 值的最大值,
 *  *   第一个方法求两个 double 值的最大值,
 *  *   第一个方法求三个 double 值的最大值,
 *  *   并调用三个方法.
 */

public class OverLoadMax {

    public void max(int i, int j){
        System.out.println(i > j ? i : j);
    }

    public void max(double i, double j){
        System.out.println(i > j ? i : j);
    }

    public void max(double i, double j, double k){
        double max = 0;
        max = i > j ? i : j;
        max = max > k ? max : k;
        System.out.println(max);
    }

}
