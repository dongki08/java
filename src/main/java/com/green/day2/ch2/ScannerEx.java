package com.green.day2.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //객체 : 속성(값저장, 명사), 메소드(기능, 동사)
        System.out.print("두자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input); //"23" > 23

        System.out.println("입력내용: " + (input + input));
        System.out.printf("num=%d\n", (num + num));
    }
}
