package com.matsuri.overLoad;

import java.util.Arrays;

/**
 * Created by Matsuri on 2022/7/22 - 4:21
 *
 * 可变个数形参的方法
 */

public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("zz", "niubi");
        test.show();
    }

    public void show(int i){
        System.out.println(i);
    }

    public void show(String s){
        System.out.println(s);
    }

    public void show(String... strs){
        //可变形参(参数个数>=0)
        System.out.println(Arrays.toString(strs));
    }
}
