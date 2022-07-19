package com.matsuri.encapsulation;

/**
 * Created by Matsuri on 2022/7/4 -- 21:50
 *
 * 面向对象的特性之一: 封装与隐藏
 * 一、 问题的引入:
 *   当我们创建一个类的对象以后, 我们可以通过 “对象.属性” 的方式, 对对象进行赋值.
 * 这里, 赋值操做要受到属性的数据类型和存储范围的约束. 除此之外, 没有其他约束条件.
 * 但是, 在实际问题中, 我们往往需要给属性赋值时加入额外的限制条件. 这个条件就不能
 * 在属性声明时体现, 我们只能通过方法进行限制条件的添加. (比如: setter、getter)
 * 同时, 我们需要避免用户再使用 “对象.属性” 的方式堆属性进行赋值. 则需要将属性声明
 * 为private.    --->此时, 针对于属性就体现了封装性.
 *
 * 二、 封装性的体现:
 *
 *
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "zz";
        animal.setAge(-1);
        animal.setLegs(-2);
        animal.info();
    }
}

class Animal{
    String name;
    private int age;
    private int legs;

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("error! age can not be negative.");
        }
    }

    public void setLegs(int legs) {
        if (legs > 0){
            this.legs = legs;
        }else {
            System.out.println("error! legs can not be negative.");
        }
    }

    public int getAge() {
        return age;
    }

    public int getLegs() {
        return legs;
    }

    public void eat(){
        System.out.println("进食. ");
    }

    public void info(){
        System.out.println("姓名: " + name
                + ", 年龄: " + age + ", 腿数: " + legs);
    }
}