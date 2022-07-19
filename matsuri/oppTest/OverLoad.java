package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/7/2 -- 4:40
 *
 * 方法的重载 (Overload)
 *
 * 1. 定义:
 *   在同一个类中，允许存在一个以上的同名方法, 只要他们的参数个数或者参数类型不同即可.
 *   "同名不同参, 同类不同型"
 * 2. 举例:
 *   Arrays类中重载的sort() / binarySearch()
 * 3. 判断是否是重载:
 *   跟方法的权限修饰符, 返回值类型, 形参变量名, 方法体都没有关系.
 * 4. 在通过对象调用方法时, 如何确定某一指定方法:
 *   方法名 ---> 形参列表
 */

public class OverLoad {


    public void getSum(int i, int j){
        System.out.println("");
    }

    public void getSum(double i, double j){
        System.out.println("");
    }

    public void getSum(String s, int i, int j){
        System.out.println("");
    }
}
