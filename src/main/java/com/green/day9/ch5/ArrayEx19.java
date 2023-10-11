package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 },
                { 21, 22, 23 },
                { 31, 32, 33 },
                { 41, 42, 43 },
                { 51, 52, 53 }
        };
        System.out.printf("번호   국어   영어    수학   총점   평균\n");
        System.out.println("------------------------------------");
        double total = 0;
        for (int z = 0; z < score.length; z++) {
            int sum = 0;
            System.out.printf(" %d    ",z + 1);
            for(int i = 0; i < score[i].length; i++) {
                System.out.printf("%3d    ",score[z][i]);
                sum += score[z][i];
            }
            total = sum / 3f;
            System.out.printf("%d",sum);
            System.out.printf("   %.1f",total);
            System.out.println();
        }
        System.out.println("--------------------------------------");

    }
}
