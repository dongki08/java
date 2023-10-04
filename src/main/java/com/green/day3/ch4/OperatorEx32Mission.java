package com.green.day3.ch4;

public class OperatorEx32Mission {
    public static void main(String[] args) {
        //만약에 n이 (음수 아무값)-10이였다면 콘솔에 10이 출력
        //만약에 n이 (양수 아무값)9이였다면 콘솔에 9가 출력
        int n = -100;
        //n = n * -1;

        if(n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }

        System.out.printf(" 값은 : %d\n" +
                " ", n < 0 ? -n : n);

        System.out.println("-------------");


        int n2 = -100;
        if(n2 < 0) {
            n2 = n2 * -1;
        }

        System.out.println(n2);

    }
}
