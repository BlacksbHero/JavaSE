package com.matsuri.recursion;

/**
 * Created by Matsuri on 2022/7/22 - 23:27
 */

public class FibonacciTest {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            int result = Fibonacci(i + 1);
            System.out.print(result + "\t");
        }
    }

    public static int Fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
