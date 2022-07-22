package com.matsuri.valuePropagation;

/**
 * Created by Matsuri on 2022/7/22 - 22:53
 */

public class ValuePropagationTest3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void method(int a, int b){
        a = 100;
        b = 200;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }
}
