package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요. ");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        for(int i = 1; i <= val; i++) {
            for(int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");

        for(int i = 0; i < val; i++) {
            for(int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
}