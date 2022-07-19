package com.matsuri.array;

import java.util.Scanner;

/**
 * Create by Matsuri on 2022/06/05 1:27
 */

public class ArrayWork2 {
    public static void main(String[] args) {
        //Input the number of students: 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of students:");
        int num = scanner.nextInt();

        //Input the scores: 56 74 89 41 89
        int[] score = new int[num];
        System.out.println("Please input the" + num + " scores:");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        //Output the original scores
        System.out.println("The original scores:");
        for (int j : score) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Find the best score
        int best_score = 0;
        for (int i : score) {
            if (best_score < i) {
                best_score = i;
            }
        }
        System.out.println("The best score is: " + best_score);

        //Output students' scores and grades
        char level;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= (best_score - 10)){
                level = 'A';
            }else if (score[i] >= (best_score - 20)){
                level = 'B';
            }else if (score[i] >= (best_score - 30)){
                level = 'C';
            }else {
                level = 'D';
            }

            System.out.println("Student " + i + " score is "
                    + score[i] + " grade is " + level);
        }

    }
}
