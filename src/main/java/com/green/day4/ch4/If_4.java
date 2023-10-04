package com.green.day4.ch4;

import java.util.Scanner;

public class If_4 {
    public static void main(String[] args) {

        int val2 = (int)(Math.random() * 151) + 50;

        System.out.printf("%d의 결과값은 : %d",
                val2, val2 <= 100 ? val2 * 2 : val2 + 10 );
    }
}