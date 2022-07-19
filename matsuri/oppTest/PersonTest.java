package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/6/21 -- 18:36
 */

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "ZZ";
        person1.age = 18;
        person1.sex = 1;

        person1.study();
        person1.showAge();
        person1.showSex();
        int newAge = person1.addAge(2);
        System.out.println("ZZ的新年龄为: " + newAge);

        //******************************
        Person person2 = new Person();
    }
}
