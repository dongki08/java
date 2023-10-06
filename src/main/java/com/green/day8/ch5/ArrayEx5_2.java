package com.green.day8.ch5;

public class ArrayEx5_2 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 }; //누군가의 과목 점수
        //총점
        //평균점수
        int sum = 0;

        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.printf("총점 : %d\n", sum);

        System.out.printf("평균점수 : %.1f", (double)sum / 5);

    }
}
