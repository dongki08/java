package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5);
        sp.line(7);

        sp.square(6);

        sp.triangle(5);

        sp.triangle1(5);

        String gender = sp.chkGenderById("011231-5117111");
        System.out.println("성별 : " + gender);
        /*
        8번째 자리의 숫자가
        2, 4이면 > 여성
        1, 3이면 > 남성
        이외의 값이면 > 유효하지않는 주민번호
         */

        int sum = sp.sumFromTo(4, 10);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println("sum : " + sum);
        System.out.println("sum2 : " + sum2);

    }
}
