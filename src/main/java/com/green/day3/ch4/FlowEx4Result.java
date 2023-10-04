package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4Result {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score < 70 && score >= 0 ) {
            System.out.println("D학점");
        }else if(score < 80 && score >= 70) {
            System.out.println("C학점");
        }else if(score < 90 && score >= 80) {
            System.out.println("B학점");
        }else if (score <= 100 && score >= 90) {
            System.out.println("A학점");
        }else {
            System.out.println("잘못 입력하였습니다");
        }

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //score값이 70점보다 같거나 크면 C학점 출력
        //나머지는 D학점


    }
}
