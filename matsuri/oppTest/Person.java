package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/6/21 -- 18:36
 */

public class Person {
    //属性
    String name;
    int age;
    int sex;    // 1为男性/0为女性

    public void study(){
        System.out.println("Studying!");
    }

    public void showAge(){
        System.out.println("Age: " + age + ".");
    }

    public int addAge(int i){
        age += i;
        return age;
    }

    public void showSex(){
        if (sex == 1){
            System.out.println("男.");
        } else if (sex == 0) {
            System.out.println("女.");
        } else {
            System.out.println("错误!");
        }
    }
}
