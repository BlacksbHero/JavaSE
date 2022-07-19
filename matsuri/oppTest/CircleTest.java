package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/6/21 -- 18:52
 */

//测试类
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println(circle.Area());
    }
}

//圆
class Circle{
    //属性
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //求圆的面积
    public double Area(){
        return Math.PI * radius * radius;
    }
}