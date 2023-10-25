package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2.staticNum = 1; //맞는 방식
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30; //잘못된 방식
        System.out.printf("mm2.num = %d, staticNum = %d\n", mm2.num, mm2.staticNum);

        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("mm2_2.num = %d, staticNum = %d\n", mm2.num, mm2_2.staticNum);

        System.out.printf("MyMath.staticNum = %d\n", MyMath2.staticNum);
        //new랑은 별개 .쓰면 레퍼런스 변수
    }
}
