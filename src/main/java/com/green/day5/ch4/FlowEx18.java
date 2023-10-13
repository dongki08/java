package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for 문을 활용하여 구구단 2단 ~ 9단
        for(int i = 2; i <= 9; i++) {
            for(int a = 1; a <= 9; a++) {
                System.out.printf("%d x %d = %d\n", i, a, i*a );
            }
            System.out.println("-----");
        }
    }
}
