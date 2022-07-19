package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/6/21 -- 21:22
 */

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        random(students);
        bubbleSort(students);
        searchState(students, 3);

    }

    //数组赋值
    public static void random(Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            students[i].score = (int)(Math.round(Math.random() * (100 - 0 + 1) + 1));
        }
        //打印数组
        print(students);
    }

    //遍历Student[]
    public static void print(Student[] students){
        for (Student student : students) {
            System.out.println(student.info());
        }
        System.out.println();
    }

    //冒泡排序成绩 从大到小
    public static void bubbleSort(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score < students[j + 1].score){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        //打印数组
        print(students);
    }

    public static void searchState(Student[] students, int state){
        for (Student student : students) {
            if (student.state == state) {
                System.out.println(student.info());
            }
        }
    }
}

class Student{
    int number;//学号 1 - 20
    int state;//年纪  [1, 6]
    int score;//成绩  [0, 100]

    //显示学生信息的方法
    public String info(){
        return "学号: " + number + ", 年级: "
                + state + ", 成绩: " + score;
    }
}

