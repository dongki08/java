package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int min = score[0], max = score[0];

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) { max = score[i]; }
            if (min > score[i]) { min = score[i]; }
        }
        System.out.printf("max : %d, min : %d\n", max, min);
    }
}
