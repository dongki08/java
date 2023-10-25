package com.green.day13.ch6;

public class VarArgEx {
    //가변인자
    public static void sum(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
        sum(10, 20, 30, 50, 60);
    }
}
