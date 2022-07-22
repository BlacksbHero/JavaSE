package com.matsuri.valuePropagation;

/**
 * Created by Matsuri on 2022/7/22 - 19:43
 *
 * 关于变量的赋值
 *
 *  如果变量是基本数据类型
 *      此时赋值的是变量所保存的数据值.
 *  如果变量是引用数据类型
 *      此时赋值的是变量所保存的数据的地址.
 */

public class ValuePropagationTest {

    public static void main(String[] args) {
        //基本数据类型
        int m = 10;
        int n = m;
        System.out.println(m + ", " + n);
        n = 20;
        System.out.println(m + ", " + n);
        System.out.println("------------------------------");

        //引用数据类型
        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1;
        System.out.println(order1.orderId + ", " + order2.orderId);

        order2.orderId = 1002;
        System.out.println(order2.orderId);

    }
}

class Order{
    int orderId;
}
