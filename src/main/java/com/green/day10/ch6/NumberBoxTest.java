package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox();

        System.out.printf("%d + %d = %d\n", 10, 20, (10 + 20));

        nb1.sum(10, 20);//아규먼트
        nb1.sum(30, 40);

        nb1.minus(40, 20); // 40 - 20 = 20
        nb1.minus(30, 20);

        nb1.abs(-10);
        nb1.abs(10);
        nb1.abs(-33);
        nb1.abs(39);

    }
}
