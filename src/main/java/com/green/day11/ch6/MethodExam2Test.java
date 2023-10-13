package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(78);
        System.out.println("r1 : " + r1);
        /*
        100초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        a학점 8점이상은 +, 3점이하는 -, 나머지 0
        b
        c
        d
         */

        String season = me2.getSeason(10);
        System.out.println("계절 : " + season);
    }
}
