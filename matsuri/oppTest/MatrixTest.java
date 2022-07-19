package com.matsuri.oppTest;

/**
 * Created by Matsuri on 2022/6/21 -- 20:18
 */

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.print();
        int area = matrix.area();
        System.out.println(area);
    }
}

class Matrix{
    int count = 0;
    public void print(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }
    }

    public int area(){
        return count;
    }
}
