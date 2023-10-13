package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(4); //4단 구구단 콘솔에 출력

        gugudan.print(5); //5단 구구단 콘솔에 출력


        System.out.println("---------------------");
        gugudan.printFromTo(4, 7);
        gugudan.printFromTo(3, 4);
        System.out.println("---------------------");

        gugudan.printFromTo(3, 6);
    }
}
