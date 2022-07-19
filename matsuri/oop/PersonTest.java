package com.matsuri.oop;

/**
 * Created by Matsuri on 2022/6/15 -- 8:34
 *
 *一、设计类, 其实就是设计类的成员
 *  属性: 成员变量、field、域、字段.
 *  方法: 成员方法、函数、method.
 *
 * 二、面向对象的使用(面向对象思想的实现):
 *  1. 创建类, 设计类的成员.
 *  2. 创建类的对象.
 *  3.通过 "对象.属性" 或 ”对象.方法“ 调用对象的结构.
 *
 * 三、如果创建了一个类的多个对象, 则每个对象都独立的拥有一套类的属性. (非static的)
 *  如果我们修改属性A的值, 则不影响属性B的值
 *
 * 四、对象的内存解析
 */

//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类变量
        Person person1 = new Person();
        person1.name = "Matsuri";
        person1.age = 23;
        person1.isMale = true;
        System.out.println("name: " + person1.name + " age: " + person1.age
                + " isMale: " + person1.isMale);
        person1.eat();
        person1.sleep();
        person1.talk("Chinese");
        System.out.println();

        //********************************
        Person person2 = new Person();
        System.out.println(person2.name); //null
        System.out.println(person2.isMale); //false
        System.out.println();

        //********************************
        /*
        将person1变量保存的对象地址值赋给person3
         ,导致person1和person3指向了堆空间中的同一个对象实体
        */
        Person person3 = person1;
        System.out.println(person3.name);
        person3.age = 10;
        System.out.println(person1.age);
        System.out.println();
    }
}

class Person{
    //属性: 对应类中的成员变量
    String name;
    int age;
    boolean isMale;

    //方法: 对应类中的成员方法
    public void eat(){
        System.out.println("可以吃饭");
    }

    public void sleep(){
        System.out.println("可以睡觉");
    }

    public void talk(String language){
        System.out.println("可以说: " + language);
    }
}