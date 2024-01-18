package com.green.day68.ch14;

@FunctionalInterface //인터페이스에 메소드 하나만 있어야함으로 검증하기위해
interface MyFunction {
    void run();
}
public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = () -> System.out.println("mf0 - run !! "); // 파라메터가 하나면 소괄호 생략가능
        // 람다식, 밑의 축약버전 보다 더 짧다 추상 메소드가 하나만 있기 때문에 메소드 선언부가 필요없다.
        MyFunction mf1 = new MyFunction() {
            public void run() {
                System.out.println("fm2 - run !!");
            }
        };

        MyFunction mf2 = new MyFunctionClass();
    }
}

class MyFunctionClass implements MyFunction {
    public void run() {
        System.out.println("class name - run !! ");
    }
}
