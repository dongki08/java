package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        String grade = "C";
        String opt = "";

        if (score >= 90) {
            grade = "A";
        }else if (score >= 80) {
            grade = "B";
        }
        if (score >= 80) {
            int rMod = score % 10;
            if (rMod >= 8 || score == 100) {
                opt = "+";
            }else if (rMod <= 3) {
                opt = "-";
            }
        }

        System.out.printf("%s%s 학점", grade, opt);
        //컨트롤 + 쉬프트 + 알트 + L (정렬)

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        //나머지는 C학점

        //예를들어 92점 > A-, 94점 > A, 98점 > A+ 출력
        //         83점 > B- 출력, 86점 > B, 89점 > B+
        //           75 or 79 or 71 > C
    }
}
