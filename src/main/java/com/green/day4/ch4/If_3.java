package com.green.day4.ch4;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {

        int val = (int) (Math.random() * 100) + 1;

        System.out.printf("%d는(은) %s수입니다", val, val % 2 == 0 ? "짝" : "홀");


    }
}