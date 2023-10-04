package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) >> ");
        Scanner scan = new Scanner(System.in);
        String HumanID = scan.nextLine();
        char gender = HumanID.charAt(7);

        switch (gender) {
            case '1','3' :
                System.out.println("남자입니다.");
                break;
            case '2','4' :
                System.out.println("여자입니다.");
                break;
            default:
                System.out.println("유효하지않는 주민등록번호입니다.");
        }
    }
}
//주민번호 입력받고
//주민번호 입력확인 > 여자, 남자인지, 유효하지않는 주민등록번호인지 출력