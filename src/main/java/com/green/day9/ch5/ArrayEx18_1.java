package com.green.day9.ch5;

public class ArrayEx18_1 {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 },
                { 21, 22, 23 },
                { 31, 32, 33 },
                { 41, 42, 43 }
        };
        for(int i = 0; i < score.length; i++){
            int[] arr = score[i];
            for(int z = 0; z < arr.length; z++) {
                int val = score[i][z];
                System.out.printf("score[%d][%d] = %d\n", i, z, val);
            }
        }
        int sum = 0;
        for (int[] arr : score) {
            for (int val : arr) {
                sum += val;
            }
        }
        System.out.printf("sum : %d\n", sum);

    }
}
