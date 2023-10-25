package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;
    //전역변수: 주소값.
    //this. 생성자호출

    public Card (String a, String b) {
        pattern = a;
        denomination = b;
    }
    //지역변수

    void prinMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }


}
