package com.green.day13.ch6;

public class MyMath2 {
    int num;
   public static int staticNum;

    void instanceAbs() {
        System.out.println(num > 0 ? -num : num);
    } // static 사용 x

   public static void staticAbs(int n) {
        System.out.println(n < 0 ? -n : n);
    } // static 사용

    static void print() {
        // print2(); 호출안됨 클래스메서드에는 인스턴스 호출 x
        System.out.printf("staticNum : %d\n", MyMath2.staticNum);
    }

    void print2() {
        print(); // 호출가능 인스턴스메서드에는 클래스메서드 호출가능
        System.out.printf("staticNum : %d, num : %d\n", MyMath2.staticNum, num);
    } //MyMath.staticNum 같은공간 생략가능 > staticNum
}
