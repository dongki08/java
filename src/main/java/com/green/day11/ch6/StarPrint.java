package com.green.day11.ch6;

import java.util.Scanner;

public class StarPrint {
    void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int n2) {
        for (int z = 0; z < n2; z++) {
            for (int i = 0; i < n2; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("_______________");
    }

    void triangle(int n) {
        for (int z = 1; z < n + 1; z++) {
            for (int i = 0; i < n; i++) {
                if (i < z) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }

    void triangle1(int n) {
        for (int z = 1; z <= n; z++) {
            line(z);
        }
    }

    String chkGenderById(String id) {
        char ch = id.charAt(7);
        switch (ch) {
            case '1', '3':
                return "남성";
            case '2', '4':
                return "여성";
        }
        return "유효하지않는 주민번호";
    }

    int sumFromTo (int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        return sum;
    }
}

