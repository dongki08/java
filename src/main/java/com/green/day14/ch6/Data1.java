package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;

    public Data1() {
        this(100, 200, 300);
    } //기본 생성자 : 생성자 만들때 생성자가 하나도 없을때
      // 생성자 사용용도 객체생성 생성자호출, 생성할 때 멤버필드값을 셋팅하고 싶을때 사용될수도 있다

    public Data1(int a) {
        value = a;

    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }


    public void printMySelf() {
        System.out.printf("value : %d, value2 : %d, value3 : %d\n", value, value2, value3);
    }
}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();

        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();
    }
}
